package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

public class TaskThreeServiceImpl implements TaskService {
    private static TaskThreeServiceImpl instance;

    private TaskThreeServiceImpl() {
    }

    public static TaskThreeServiceImpl getInstance() {
        if (instance == null) {
            instance = new TaskThreeServiceImpl();
        }
        return instance;
    }

    @Override
    public void runTask() {
        System.out.println(add("1", "1"));
        System.out.println(add("123", "456"));
        System.out.println(add("888", "222"));
        System.out.println(add("1372", "69"));
        System.out.println(add("12", "456"));
        System.out.println(add("100", "101"));
        System.out.println(add("63829983432984289347293874", "90938498237058927340892374089"));
    }

    public static String add(String a, String b) {
        char[] minTerm = getMinLengthString(a, b).toCharArray();
        StringBuilder result = new StringBuilder(getMaxLengthString(a, b));
        for (int i = minTerm.length - 1, j = result.length() - 1; i >= 0; i--, j--) {
            int firstDigitFromMaxLengthNumber = convertCharToDigit(result.charAt(j));
            int secondDigitFromMinLengthNumber = convertCharToDigit(minTerm[i]);
            int sum = firstDigitFromMaxLengthNumber + secondDigitFromMinLengthNumber;
            result = addSumDigit(result, sum, j);
        }
        return refactorResult(result).toString();
    }

    private static String getMinLengthString(String firstString, String secondString) {
        return firstString.length() < secondString.length() ? firstString : secondString;
    }

    private static String getMaxLengthString(String firstString, String secondString) {
        return firstString.length() >= secondString.length() ? firstString : secondString;
    }

    private static int convertCharToDigit(char character) {
        return Integer.parseInt(String.valueOf(character));
    }

    private static StringBuilder addSumDigit(StringBuilder result, int sum, int index) {
        if (sum < 10) {
            result.replace(index, index + 1, String.valueOf(sum));
        } else {
            result.replace(index, index + 1, String.valueOf(sum % 10));
            if (index - 1 >= 0) {
                int nextDigit = convertCharToDigit(result.charAt(index - 1));
                ++nextDigit;
                result = addSumDigit(result, nextDigit, index - 1);
            } else {
                result.insert(0, 1);
            }
        }
        return result;
    }

    private static StringBuilder refactorResult(StringBuilder result) {
        while (result.charAt(0) == '0') {
            result.delete(0, 1);
        }
        return result;
    }
}
