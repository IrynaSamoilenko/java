package com.epam.hometasks.ht4;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 06/03/2019
 */

public class HomeTasks4_1 {
    public static void main(String[] args) {
        System.out.println("Input text -> ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The unique and DOESN'T DUPLICATE symbols of this string: " + uniqueChars(str) +'.');
        System.out.println("The all unique symbols of this string: " + allUniqueChars(str) +'.');

    }

    // method search unique and DOESN'T DUPLICATE symbols in the entered string
    public static String uniqueChars(String str) {
        str = str.toLowerCase();
        String storage = "";
        int length = str.length();
        int index = 0;
        while (index < length) {
            char ch = str.charAt(index++);
            if (str.indexOf(ch) == str.lastIndexOf(ch)&&!storage.contains(String.valueOf(ch))){
                storage += "'" + ch + "',";
            } else {
                storage="0. The string doesn't have unique and DOESN'T DUPLICATE symbols";
            }
        }
        return storage;
    }
    // method search all unique symbols (all symbols, but in one piece) in the entered string
    public static String allUniqueChars(String str) {
        str = str.toLowerCase();
        String storage = "";
        int length = str.length();
        int index = 0;
        while (index < length) {
            char ch = str.charAt(index++);
            if (!storage.contains(String.valueOf(ch))) {
                storage += "'" + ch + "',";
                }
        }
        return storage.substring(0, storage.length() - 1);
    }
}
