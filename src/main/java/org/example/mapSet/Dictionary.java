package org.example.mapSet;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("Введитет текст");
        try (Scanner scanner = new Scanner(System.in)) {
            String text = scanner.nextLine();
            String[] str = text.split("\\s+");

            for (String word : str) {
                hashMap.put(word, hashMap.containsKey(word) ? hashMap.get(word) + 1 : 1);
            }
            System.out.println(hashMap);
        }
    }
}
