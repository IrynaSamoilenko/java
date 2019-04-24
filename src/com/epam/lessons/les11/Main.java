package com.epam.lessons.les11;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhoneRecord("Iryna", "1");
        phoneBook.addPhoneRecord("Ila", "2");
        phoneBook.addPhoneRecord("Ann", "4");
        phoneBook.addPhoneRecord("Masha", "3");
        phoneBook.addPhoneRecord("Alex", "7");
        phoneBook.addPhoneRecord("Oleg", "5");
        phoneBook.addPhoneRecord("Igor", "9");
        System.out.println(phoneBook.printPhoneBook());
        System.out.println(phoneBook.sortByName());
        System.out.println(phoneBook.sortByPhone());
    }
}
