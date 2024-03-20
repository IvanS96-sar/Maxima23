package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(15, 4, 11, 7, 5, 21);
        int sum = integerList.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println("Сумма: " + sum);
        double average = integerList.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение: " + average);

        long count = integerList.stream()
                .filter(p -> p > 10)
                .count();
        System.out.println("Количество чисел больше 10: " + count);
    }
}
