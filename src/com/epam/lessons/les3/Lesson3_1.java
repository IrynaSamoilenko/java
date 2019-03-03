package com.epam.lessons.les3;

/**
 * Find a max number
 * 26/02/2019
 */


public class Lesson3_1 {
    public static void main(String[] args) {

        int a = 1, b = -20, c = -300;
        int maxValue = a;
        if (maxValue < b) {
            maxValue = b;
        }
        if (maxValue < c){
            maxValue = c;
        }
    System.out.println("Max is " + maxValue);
    }


}
