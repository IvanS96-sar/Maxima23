package org.example.generaliz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        swap(list, 0, 4);
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Хлеб");
        list1.add("Молоко");
        list1.add("Чай");
        list1.add("Кофе");
        list1.add("Шоколадка");
        System.out.println(list1);
        swap(list1, 0, 3);
        System.out.println(list1);
    }

    public static <T> void swap(List<T> list, int index1, int index2) {
        Collections.swap(list, index1, index2);
    }
}
