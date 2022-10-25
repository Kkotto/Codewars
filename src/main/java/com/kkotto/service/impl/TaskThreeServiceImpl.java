package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.List;


public class TaskThreeServiceImpl implements TaskService {
    @Override
    public void runTask() {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    //My solution
    public String disemvowel(String str) {
        List<Character> vowels = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    //Best Solution
    /*
    public String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }*/
}
