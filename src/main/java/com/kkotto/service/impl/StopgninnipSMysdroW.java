package com.kkotto.service.impl;

import com.kkotto.service.TaskService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StopgninnipSMysdroW implements TaskService {
    public final String WORDS_SPLIT_REGEX = " ";
    public final int REVERSE_WORD_MIN_LENGTH = 5;

    @Override
    public void haveFun() {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }

    private String spinWords(String sentence) {
        List<String> words = Arrays.stream(sentence.split(WORDS_SPLIT_REGEX))
                .map(s -> s.length() >= REVERSE_WORD_MIN_LENGTH ? reverseWord(s) : s)
                .collect(Collectors.toList());
        return convertListToString(words);
    }

    private String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    private String convertListToString(List<String> originalList) {
        StringBuilder sentenceBuilder = new StringBuilder();
        originalList.forEach(s -> sentenceBuilder.append(s).append(WORDS_SPLIT_REGEX));
        return sentenceBuilder.delete(sentenceBuilder.lastIndexOf(WORDS_SPLIT_REGEX), sentenceBuilder.length()).toString();
    }
}
