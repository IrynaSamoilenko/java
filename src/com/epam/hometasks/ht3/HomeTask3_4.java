package com.epam.hometasks.ht3;

/**
 * By Samoilenko Iryna
 * 03/03/2019
 */

public class HomeTask3_4 {
    public static void main(String[] args) {
        String stars = "         *";
        while (!stars.equals("**********")) {
            System.out.println(stars);
            stars = stars.substring(1);
            stars += "*";
        }
        while (!stars.equals("         *")) {
            stars = stars.substring(0, stars.length() - 1);
            stars = " " + stars;
            System.out.println(stars);
        }
    }
}


