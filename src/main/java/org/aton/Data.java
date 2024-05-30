package org.aton;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private final Map<String, String> ordersList;

    public Data() {
        ordersList = new HashMap<>();
    }

    public void addEntry(String phoneNumber, String name) {
        if (isValidPhoneNumber(phoneNumber) && isValidName(name)) {
            ordersList.put(phoneNumber, name);
        } else {
            throw new IllegalArgumentException("Invalid phone number or name");
        }
    }

    public String getName(String phoneNumber) {
        return ordersList.get(phoneNumber);
    }

    public void removeEntry(String phoneNumber) {
        ordersList.remove(phoneNumber);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{11,}");
    }

    private boolean isValidName(String name) {
        return name != null && name.length() <= 42;
    }

    public Map<String, String> getAllEntries() {
        return new HashMap<>(ordersList);
    }
}
