package org.example.mapSet;

import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Supplier;

@Log
public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        log.info("Введитет текст");
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            String[] str = text.split("\\s+");

            for (String word : str) {
                hashMap.put(word, hashMap.containsKey(word) ? hashMap.get(word) + 1 : 1);
            }
            log.info("Количество введеных слов: " + hashMap);
        }
    }
}
