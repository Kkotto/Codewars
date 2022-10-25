package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

public class TaskTwoServiceImpl implements TaskService {

    @Override
    public void runTask() {
        System.out.println(solution("abc", "d"));
    }

    //My solution
    public boolean solution(String str, String ending) {
        return str.lastIndexOf(ending) == str.length() - ending.length() && str.length() - ending.length() >= 0;
    }

    //Best solution
    /*public boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }*/
}
