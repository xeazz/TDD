package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> book = new HashMap<>();

    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }

    public String findByNumber(String number) {
        for (Map.Entry<String, String> key : book.entrySet()) {
            if (key.getValue().equals(number)) {
                return key.getKey();
            }
        }
        return null;
    }
}
