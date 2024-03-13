package org.example.list;

import java.util.ArrayList;

public class BookShelf {
    private ArrayList<String> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }


    /**
     * метод  добавляет название книги в список
     * @param bookName название книги,которую мы добавляем
     */
    public void addBook(String bookName) {
        books.add(bookName);
    }

    /**
     * Метод удаляет книгу по названию
     * @param bookName название книги,которую мы удаляем
     */
    public void removeBook(String bookName) {
        books.remove(bookName);
    }

    /**
     * выводит в консоль список всех книг на полке.
     */
    public void listBooks() {
        for (String book : books) {
            System.out.print(book + " ");
        }
    }

}
