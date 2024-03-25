package org.example.mapSet;

import lombok.extern.java.Log;

@Log
public class realizPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Роман","89271973125");
        phoneBook.addContact("Сергей","89372953125");
        phoneBook.addContact("Дмитрий","89023257896");
        phoneBook.addContact("Михаил","89295479007");
        phoneBook.addContact("Артем","89063478965");
        log.info("Все контакты: " + phoneBook);

        phoneBook.getNumber("Роман");
        phoneBook.removeContact("Артем");
    }
}
