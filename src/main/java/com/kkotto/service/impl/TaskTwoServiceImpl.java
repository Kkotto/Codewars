package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwoServiceImpl implements TaskService {
    private static TaskTwoServiceImpl instance;

    private TaskTwoServiceImpl() {
    }

    public static TaskTwoServiceImpl getInstance() {
        if (instance == null) {
            instance = new TaskTwoServiceImpl();
        }
        return instance;
    }

    @Override
    public void runTask() {
        String text = "abcd";
        System.out.println(Arrays.toString(splitByTwoLetters(text)));
    }

    public String[] splitByTwoLetters(String string) {
        if (string.length() % 2 != 0) {
            string += "_";
        }
        List<String> list = new ArrayList<>();
        while (string.length() > 2) {
            list.add(string.substring(0, 2));
            string = string.substring(2);
        }
        list.add(string);
        return list.toArray(String[]::new);
    }
}
