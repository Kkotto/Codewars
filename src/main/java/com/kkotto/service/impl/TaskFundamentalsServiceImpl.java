package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TaskFundamentalsServiceImpl implements TaskService {
    @Override
    public void runTask() {
        System.out.println(even_or_odd(10));
        System.out.println(stringToNumber("4382"));
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(validatePin("1234"));
    }

    public String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    //My solution
    public int[] digitize(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        int[] arr = new int[sb.length()];
        int i=0;
        for(char s : sb.toString().toCharArray()){
            arr[i] = Integer.parseInt(String.valueOf(s));
            i++;
        }
        return arr;
    }

    //Best solution
    public int[] digitizeBest(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    //My solution
    public boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");
    }

    //Best solution
    public static boolean validatePinBest(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}
