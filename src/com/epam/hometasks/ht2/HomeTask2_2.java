package com.epam.hometasks.ht2;
import java.util.Scanner;

/**
 * Count a difference between input value and reverse input value
 * By Samoilenko Iryna
 * 23/02/2019
 */
public class HomeTask2_2 {
    public static void main (String[]args){
        System.out.println("Input first number: ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int resultNumber = 0;
        for (int i = inputNumber; i !=0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        System.out.println(inputNumber - resultNumber);
    }
}