package ru.kfc.autotest;

import java.util.*;

public class CountingSymbols {
    public static void main(String[] args) {
        String input = "Частнопредпринимательский";
        printCountingSymbols(input);
    }

    public static void printCountingSymbols(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Смотрим в каждый символ строки
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
                // Если символ есть, увеличиваем счётчик

            } else {
                frequencyMap.put(c, 1);
                // Или оставляем с прежним 1
            }
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Символ " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
