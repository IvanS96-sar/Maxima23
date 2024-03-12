package org.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Operation {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Яблоко");
        fruits.add("Гранат");
        fruits.add("Виноград");
        fruits.add("Черешня");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Картошка");
        vegetables.add("Морковь");
        vegetables.add("Огурец");
        vegetables.add("Помидор");
        vegetables.add("Сельдерей");

        LinkedList<String> list = new LinkedList<>();
        list.addAll(fruits);
        list.addAll(vegetables);
        System.out.println(list);

        System.out.println(list.containsAll(fruits));
        System.out.println(list.containsAll(vegetables));

        list.removeAll(vegetables);
        System.out.println(list);
    }
}
