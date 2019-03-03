package com.epam.hometasks.ht3;

public class HomeTask3_5_1 {
    public static void main(String[] args) {
        int i = 0 ;
        while (i<2){
            String stars = "     *     ";
            int n = 4;
            int m = 6;
            while (!stars.equals("**********") && n>-1) {
                System.out.println(stars);
                stars = stars.substring(0, n) + "*" + stars.substring(n+1, m) + "*" + stars.substring(m);
                n--;
                m++;
            }
            i++;
        }
    }
}