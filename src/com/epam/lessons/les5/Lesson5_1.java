package com.epam.lessons.les5;
import java.util.Arrays;


public class Lesson5_1 {
        public static void main(String[] args) {
            int [][] arrayInt = getArray();

            System.out.println("Sum = " + sum(arrayInt));
            printArray(arrayInt);
        }

        static int[][] getArray() {
            return new int[][] {{1, 2, 3, 4, 5},
                    {5, 4, 3, 2, 1},
                    {0, 2, 0, 4, 0}};
        }

        static int sum(int[][] arr) {
            int sum = 0;
            for (int[] line: arr) {
                for (int value : line) {
                    sum += value;
                }
            }
            return sum;
        }

        static void printArray (int[][] arrayInt) {
            for (int[] line: arrayInt) {
                System.out.println(Arrays.toString(line));
            }
        }


}