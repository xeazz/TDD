package org.example;

import java.util.*;

public class PhoneBook {
    private final TreeMap<String, String> book = new TreeMap<>();
    private final List<Contact> listContact = new ArrayList<>();
    private final Map<String, Integer> listName = new HashMap<>();
    private final Map<String, Integer> listPhoneNumber = new HashMap<>();
    private static int COUNT_LIST = 0;


    public int add(String name, String number) {
        book.put(name, number);
        listContact.add(new Contact(name, number));
        listName.put(name, COUNT_LIST);
        listPhoneNumber.put(number, COUNT_LIST);
        COUNT_LIST++;
        return book.size();
    }

    public String findByNumber(String number) {
        int numberPage = listPhoneNumber.get(number);
        Contact list = listContact.get(numberPage);
        return list.getName();
    }

    public String findByName(String name) {
        int numberPage = listName.get(name);
        Contact list = listContact.get(numberPage);
        return list.getPhoneNumber();
    }

    public String printAllNames() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> a : book.entrySet()) {
            sb.append(a.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

}
