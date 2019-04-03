package com.epam.hometasks.ht5;
import java.util.Scanner;

/**
 * Printer array and reverse array
 * Created by Samoilenko Iryna
 * 09/03/2019
 */

public class Hometask5_1 {
    public static void main(String[] args) {
        int[] array = createArray(getSize());
        printArray(array);
        printArrayReverse(array);


    }

    static int getSize(){
        System.out.println("Enter number of array elements -> ");
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        if (array_size <= 0) {
            System.out.println("");
            System.exit(-1);
        }
        return array_size;


    }

    static int[] createArray(int ARRAY_SIZE){
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++){
            array[i] = (((int)Math.round(Math.random()*100))-50);
        }
        return array;
    }

    static void printArray(int[] array) {
        System.out.println("Normal array: ");
        for (int element : array) {
            System.out.print(element + "; "); //or Array.toString

        }
    }

    static void printArrayReverse(int[] array){
        System.out.println("\nReverse array: ");
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] + "; ");
        }
    }
}