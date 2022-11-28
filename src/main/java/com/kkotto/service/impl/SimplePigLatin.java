package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimplePigLatin implements TaskService {
    @Override
    public void haveFun() {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {
        List<String> words = List.of(str.split(" "));
        List<String> result =  words.stream()
                .map(s -> s.matches("(\\w)*")?s.substring(1)+s.charAt(0)+"ay":s)
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(String word : result){
            sb.append(word).append(" ");
        }
        sb.delete(sb.lastIndexOf(" "), sb.length());
        return sb.toString();
    }

    public static String pigItBestSolution(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static String pigItBestJoiningSolution(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}
