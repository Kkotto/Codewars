package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;

public class FindTheParityOutlier implements TaskService {
    @Override
    public void haveFun() {
        int[] arr = {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(arr));
    }

    private int find(int[] integers) {
        int odd = 0, even = 0, numberOfEven = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                even = integer;
                numberOfEven++;
            } else {
                odd = integer;
            }
        }
        return numberOfEven > 1 ? odd : even;
    }

    public static int findBestSolution(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}
