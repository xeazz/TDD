package org.example;

import java.util.*;

public class PhoneBook {
    private final TreeMap<String, String> book = new TreeMap<>();

    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }

    public Object findByNumber(String number) {
        Set<String> nameContact = book.keySet();
        Object[] a = nameContact.toArray();
        ArrayList<String> phoneNumber = new ArrayList<>(book.values());
        if (phoneNumber.contains(number)) {
            return a[phoneNumber.indexOf(number)];
        }
        return null;
    }

    public String findByName(String name) {
        return book.get(name);
    }

    public String printAllNames() {
        return null;
    }

}
