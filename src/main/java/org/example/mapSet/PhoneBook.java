package org.example.mapSet;

import lombok.extern.java.Log;

import java.util.HashMap;
@Log
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
        log.info("Номер: " + phoneMap.get(name));
    }

    public void removeContact(String name) {
        phoneMap.remove(name);
        log.info("Оставшиеся контакты: " + phoneMap);
    }
}

