package com.epam.hometasks.ht5;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        final int ARRAY_SIZE = sc.nextInt();
        int[] array = createArray(ARRAY_SIZE);
        printArray(array);
        amountOddElements(array);
        sumOddElements(array);
    }

    static int[] createArray(int ARRAY_SIZE){
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++){
            array[i] = (((int)Math.round(Math.random()*100))-50);
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.println("Entered array: ");
        for (int element : array) {
            System.out.print(element + "; ");

        }
    }

    static void amountOddElements(int[] array){
        int numberOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 !=0) {
                numberOdd++;
            }
        }
        System.out.println("\nThe number of add elements = " + numberOdd);
    }

    static void sumOddElements(int[] array){
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 !=0) {
                sumOdd+=array[i];
            }
        }
        System.out.println("\nThe sum of the add elements = " + sumOdd);
    }
}
