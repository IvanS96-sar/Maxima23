package org.example.mapSet;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class UniqueName {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        System.out.println("Введите имя");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";
            while (!name.equalsIgnoreCase("stop")) {
                hashSet.add(name.toLowerCase());
                name = scanner.next();

            }
            System.out.println("Уникальные имена:");
            for (String uniqName : hashSet) {
                System.out.print(uniqName + " ");
            }

        }
    }
}








