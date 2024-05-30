package org.aton;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Data phoneBook = new Data();
        Random random = new Random();

        int totalEntries = 30000000;

        for (int i = 0; i < totalEntries; i++) {
            String phoneNumber = generateRandomPhoneNumber(random);
            String name = generateRandomName(random);
            phoneBook.addEntry(phoneNumber, name);
            System.out.println(i);
        }

        System.out.println("Total entries added: " + phoneBook.getAllEntries().size());
    }

    private static String generateRandomName(Random random) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        int nameLength = random.nextInt(41) + 2; // Имя от 1 до 20 символов
        for (int i = 0; i < nameLength; i++) {
            name.append(characters.charAt(random.nextInt(characters.length())));
        }
        return name.toString();
    }

    private static String generateRandomPhoneNumber(Random random) {
        StringBuilder phoneNumber = new StringBuilder("+");
        for (int i = 0; i < 11; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }
}