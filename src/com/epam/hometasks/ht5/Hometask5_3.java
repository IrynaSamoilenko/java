package com.epam.hometasks.ht5;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_3 {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] arrayFirst = createArray(arraySize);
        int[] arraySecond = createArray(arraySize);
        int[] arrayResult = getArrayResult(arrayFirst, arraySecond, arraySize);

        System.out.println("Array #1: ");
        printArray(arrayFirst);
        System.out.println("\nArray #2: ");
        printArray(arraySecond);
        System.out.println("\nResult array: ");
        printArray(arrayResult);



    }

    static int[] createArray(int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = (((int)Math.round(Math.random()*100))-50);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "; ");

        }
    }

    static int[] getArrayResult(int[] array1, int[] array2, int arraySize){
        int [] arrayResult = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            arrayResult[i] = array1[i] + array2[i];
        }
        return arrayResult;
    }
}
