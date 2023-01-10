package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;

public class TaskOneServiceImpl implements TaskService {
    @Override
    public void runTask() {
        System.out.println(toCamelCase("the_stealth_warrior"));
    }

    //My solution
    public String toCamelCase(String s) {
        if (s.isEmpty())
            return "";
        StringBuilder result = new StringBuilder();
        StringBuilder s1 = new StringBuilder(s);
        String regex = s.contains("-") ? "-" : "_";
        while (s1.indexOf(regex) != -1) {
            int regexIndex = s1.indexOf(regex);
            String substring = s1.substring(0, regexIndex);
            s1.delete(0, regexIndex + 1);
            char[] letters = substring.toLowerCase().toCharArray();
            letters[0] = substring.toUpperCase().charAt(0);
            s1.replace(0, 1, String.valueOf(s1.toString().toUpperCase().charAt(0)));
            result.append(letters);
        }
        result.append(s1);
        result.replace(0, 1, String.valueOf(s.charAt(0)));
        return result.toString();
    }

    //Best solution
    static String toCamelCaseBest(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

}
