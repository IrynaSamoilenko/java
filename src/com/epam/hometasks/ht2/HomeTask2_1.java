package com.epam.hometasks.ht2;
import java.util.Scanner;

public class HomeTask2_1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Input first number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Input second number: ");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("CHANGES: Thee first number is "+ a + " and the second number is "+ b);
    }
}
