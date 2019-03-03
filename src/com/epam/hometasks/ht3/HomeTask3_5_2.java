package com.epam.hometasks.ht3;

/**
 * By Samoilenko Iryna
 * 03/03/2019
 */

public class HomeTask3_5_2 {
    public static void main(String[] args) {
        String stars = "     *     ";
        int n = 4;
        int m = 6;
        while (!stars.equals("**********") && n>-1) {
            System.out.println(stars);
            stars = stars.substring(0, n) + "*" + stars.substring(n+1, m) + "*" + stars.substring(m);
            n--;
            m++;
        }
        while (!stars.equals("     *     ")){
            System.out.println(stars);
            n++;
            m--;
            stars = stars.substring(0, n) + " " + stars.substring(n+1, m) + " " + stars.substring(m+1);


        }
    }
}

