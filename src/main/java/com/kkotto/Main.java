package com.kkotto;

import com.kkotto.service.impl.TaskFundamentalsServiceImpl;
import com.kkotto.service.impl.TaskOneServiceImpl;
import com.kkotto.service.impl.TaskThreeServiceImpl;
import com.kkotto.service.impl.TaskTwoServiceImpl;

public class Main {
    public static void main(String[] args) {
        new TaskFundamentalsServiceImpl().runTask();
        //new TaskOneServiceImpl().runTask();
        //new TaskTwoServiceImpl().runTask();
        //new TaskThreeServiceImpl().runTask();
    }
}