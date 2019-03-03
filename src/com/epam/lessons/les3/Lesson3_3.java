package com.epam.lessons.les3;

public class Lesson3_3 {
    public static void main(String[] args) {
        int row = 1;
        while (row < 10) {
            int number = row;
            while (number >= 1) {
                System.out.print(number);
                number--;
            }
            row++;
            System.out.println();
        }
    }
}
