package com.epam.hometasks.ht5;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_1 {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = createArray(arraySize);
        printArray(array);
        printArrayReverse(array);


    }

    static int[] createArray(int arraySize){
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = (((int)Math.round(Math.random()*100))-50);
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.println("Normal array: ");
        for (int element : array) {
            System.out.print(element + "; ");

        }
    }

    static void printArrayReverse(int[] array){
        System.out.println("\nReverse array: ");
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + "; ");
        }
    }
}