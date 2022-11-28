package com.kkotto;

import com.kkotto.service.TaskService;
import com.kkotto.service.impl.FindTheParityOutlier;
import com.kkotto.service.impl.MultiplesOf3Or5;
import com.kkotto.service.impl.SimplePigLatin;
import com.kkotto.service.impl.StopgninnipSMysdroW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TaskService> taskServiceList = new ArrayList<>();
        taskServiceList.add(new StopgninnipSMysdroW());
        taskServiceList.add(new MultiplesOf3Or5());
        taskServiceList.add(new FindTheParityOutlier());
        taskServiceList.add(new SimplePigLatin());
        taskServiceList.forEach(TaskService::haveFun);
    }
}