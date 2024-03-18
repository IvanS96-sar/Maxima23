package org.example.stream;

import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Война и мир", 1867),
                new Book("Выбор", 1996),
                new Book("Оно", 2020),
                new Book("Судьба", 2015),
                new Book("Гонщик", 2017)
        );
        List<String> list = bookList.stream()
                .filter(p -> p.getYear() > 2000)
                .map(Book::getName)
                .toList();
        System.out.println("Список строк: " + list);

    }
}
