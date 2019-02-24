package com.epam.hometasks.ht2;
import java.util.Scanner;

public class HomeTask2_3 {
    public static void main(String[] args) {
        System.out.println("Enter wight in pounds:");
        Scanner sc = new Scanner(System.in);
        int weightPounds = sc.nextInt();
        int weightKgs = weightPounds * 436 / 1000;
        int weightGrams = weightPounds * 436 % 1000;
        System.out.println(weightPounds+" pounds = " + weightKgs+"kg "+ weightGrams +"grams");
    }
}
