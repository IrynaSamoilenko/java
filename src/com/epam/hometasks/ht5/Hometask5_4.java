package com.epam.hometasks.ht5;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Divide array for two other arrays:
 * array#1 consist of positive integers
 * array#2 consist of negative integers
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_4 {
    public static void main(String[] args) {
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        final int ARRAY_SIZE = sc.nextInt();
        int[] arrayEntered = createArray(ARRAY_SIZE);
        System.out.println("Array Entered: ");
        printArray(arrayEntered);

        int[] arraySorted = bubbleSort(arrayEntered);
        System.out.println("\nArray Sortred: ");
        printArray(arraySorted);

        int[] arrayResultPositive = getArrayResultPositive(arraySorted, ARRAY_SIZE);
        System.out.println("\nArray (only Positive Numbers): ");
        printArray(arrayResultPositive);

        int[] arrayResultNegative = getArrayResultNegative(arrayEntered, ARRAY_SIZE);
        System.out.println("\nArray (only Negative Numbers):  ");
        printArray(arrayResultNegative);
    }

    static int[] createArray(int ARRAY_SIZE) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (((int) Math.round(Math.random() * 100)) - 50);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "; ");

        }
    }

    static int[] bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    static int[] getArrayResultPositive(int[] arraySorted, int ARRAY_SIZE) {
        int index = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (arraySorted[i] >= 0) {
                index = i;
            }
        }
        int [] arrayResultPositive = Arrays.copyOfRange(arraySorted, index, arraySorted.length);
        return arrayResultPositive;
    }

    static int[] getArrayResultNegative(int[] arraySorted, int ARRAY_SIZE) {
        int index = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (arraySorted[i] < 0) {
               index = i;
            }
        }
        int [] arrayResultNegative = Arrays.copyOfRange(arraySorted, 0, index);
        return arrayResultNegative;
    }
}