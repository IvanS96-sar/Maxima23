package org.example.mapSet;

import lombok.extern.java.Log;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
@Log
public class UniqueName {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        log.info("Введите имя");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";
            while (!name.equalsIgnoreCase("stop")) {
                hashSet.add(name.toLowerCase());
                name = scanner.next();

            }
            log.info("Уникальные имена:");
            for (String uniqName : hashSet) {
                log.info(" " + uniqName );
            }
        }
    }
}








