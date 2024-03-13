package org.example.list;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Бременские музыканты");
        bookShelf.addBook("Выбор");
        bookShelf.addBook("Теремок");
        System.out.println("Все книги на полке:");
        bookShelf.listBooks();
        System.out.println();
        bookShelf.removeBook("Выбор");
        System.out.println("Оставшиеся книги на полке:");
        bookShelf.listBooks();
    }
}
