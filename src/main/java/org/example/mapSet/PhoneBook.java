package org.example.mapSet;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> phoneMap;

    public PhoneBook() {
        this.phoneMap = new HashMap<>(
        );
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneHashMap=" + phoneMap +
                '}';
    }

    public void addContact(String name, String phoneNumber) {
        phoneMap.put(name, phoneNumber);
    }

    public void getNumber(String name) {
        System.out.println("Номер: " + phoneMap.get(name));
    }

    public void removeContact(String name) {
        phoneMap.remove(name);
        System.out.println("Оставшиеся контакты: " + phoneMap);
    }
}

