package org.example.generaliz;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Атлант","Viktor Vasin",1975);
        Book book1 = new Book("Атлант","Viktor Vasin",1966);
        System.out.println(book.equals(book1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}
