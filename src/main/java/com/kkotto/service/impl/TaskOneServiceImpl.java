package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskOneServiceImpl implements TaskService {
    private static TaskOneServiceImpl instance;

    private TaskOneServiceImpl() {
    }

    public static TaskOneServiceImpl getInstance() {
        if (instance == null) {
            instance = new TaskOneServiceImpl();
        }
        return instance;
    }

    public static final int VALUE = 9119;

    @Override
    public void runTask() {
        System.out.println("Value: " + VALUE);
        System.out.println("Result: " + squareDigits(VALUE));
    }

    public int squareDigits(int value) {
        String[] listOfValues = String.valueOf(value).split("\\.?");
        String result = Arrays.stream(listOfValues)
                .map(Integer::valueOf)
                .map(number -> number * number)
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        return Integer.parseInt(result);
    }
}
