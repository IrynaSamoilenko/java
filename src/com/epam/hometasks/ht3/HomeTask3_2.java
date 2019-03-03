package com.epam.hometasks.ht3;

/**
 * By Samoilenko Iryna
 * 03/03/2019
 */

public class HomeTask3_2 {
    public static void main(String[] args) {
        String stars = "**********";
        while (stars.length()>0){
            System.out.println(stars);
            stars=stars.substring(1);
        }
    }
}
