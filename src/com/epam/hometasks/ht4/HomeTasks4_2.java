package com.epam.hometasks.ht4;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 06/03/2019
 */

public class HomeTasks4_2 {
    public static void main(String[] args) {
        System.out.println("Enter decimal number -> ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The decimal number "+number+" in binary system equal "+convertToBinary(number));
    }

    public static String convertToBinary(int number) {
        String result = "";
        if (number == 0) {
            result = Integer.toString(number);
        } else {
            while (number != 0) {
                int b = number % 2;
                result = Integer.toString(b) + result;
                number /= 2;
            }
        }
        return result;
    }
}
