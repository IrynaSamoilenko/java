package com.epam.hometasks.ht5;
import java.util.Scanner;

/**
 * Create an array from two other arrays:
 * arrayRes[i] = array1[i]+array2[i]
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_3 {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        final int ARRAY_SIZE = sc.nextInt();
        int[] arrayFirst = createArray(ARRAY_SIZE);
        int[] arraySecond = createArray(ARRAY_SIZE);
        int[] arrayResult = getArrayResult(arrayFirst, arraySecond, ARRAY_SIZE);

        System.out.println("Array #1: ");
        printArray(arrayFirst);
        System.out.println("\nArray #2: ");
        printArray(arraySecond);
        System.out.println("\nResult array: ");
        printArray(arrayResult);



    }

    static int[] createArray(int ARRAY_SIZE){
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++){
            array[i] = (((int)Math.round(Math.random()*100))-50);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "; ");

        }
    }

    static int[] getArrayResult(int[] array1, int[] array2, int ARRAY_SIZE){
        int [] arrayResult = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++){
            arrayResult[i] = array1[i] + array2[i];
        }
        return arrayResult;
    }
}
