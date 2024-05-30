package org.aton;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DataHashMap dataHashMap = new DataHashMap();
        DataTreeMap dataTreeMap = new DataTreeMap();
        Random random = new Random();

        int totalEntries = 18758328;

        for (int i = 0; i < totalEntries; i++) {
            String phoneNumber = generateRandomPhoneNumber(random);
            String name = generateRandomName(random);
            //dataHashMap.addEntry(phoneNumber, name);
            dataTreeMap.addEntry(phoneNumber, name);
            System.out.println(i);
        }

        System.out.println("Total entries added: " + dataTreeMap.getAllEntries().size());
    }

    private static String generateRandomName(Random random) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        int nameLength = random.nextInt(40) + 2; // Имя от 1 до 20 символов
        for (int i = 0; i < nameLength; i++) {
            name.append(characters.charAt(random.nextInt(characters.length())));
        }
        return name.toString();
    }

    private static String generateRandomPhoneNumber(Random random) {
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }
}