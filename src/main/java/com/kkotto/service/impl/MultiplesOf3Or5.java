package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

public class MultiplesOf3Or5 implements TaskService {
    private final int DIVIDER_3 = 3;
    private final int DIVIDER_5 = 5;

    @Override
    public void haveFun() {
        System.out.println(solution(10));
    }

    private int solution(int number) {
        if (number < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % DIVIDER_3 == 0 || i % DIVIDER_5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
