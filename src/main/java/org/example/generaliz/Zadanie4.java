package org.example.generaliz;

import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("Сумма элементов  Integer: " + sumOfList(integerList));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Сумма элементов Double: " + sumOfList(doubleList));

    }

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
