package org.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> list = Stream.of("Азбука", "Молоко", "Батон", "Дом", "Лимонад")
                .filter(p -> p.length() > 5)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Отсортированый лист: " + list);
    }
}
