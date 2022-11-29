package com.kkotto;

import com.kkotto.service.TaskService;
import com.kkotto.service.impl.TaskOneServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TaskService> listOfTasks = new ArrayList<>();
        listOfTasks.add(TaskOneServiceImpl.getInstance());
        for (TaskService task : listOfTasks) {
            task.runTask();
        }
    }
}