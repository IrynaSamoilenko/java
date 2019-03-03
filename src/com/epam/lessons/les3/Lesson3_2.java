package com.epam.lessons.les3;
import java.util.Scanner;

/**
 * Write in words value of input number
 * 26/02/2019
 */

public class Lesson3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number from 0 to 2 -> ");
        int number = sc.nextInt();
        switch (number) {
            default:
                System.out.println("Invalid value!");
                break;
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }



    }
}
