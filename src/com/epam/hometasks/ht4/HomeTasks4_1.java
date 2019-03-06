package com.epam.hometasks.ht4;
import java.util.Scanner;

/**
 * Created by Samoilenko Iryna
 * 06/03/2019
 */

public class HomeTasks4_1 {
    public static void main(String[] args) {
        System.out.println("Input text -> ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The unique symbols of this string: " + uniqueChars(str) +'.');

    }

    public static String uniqueChars(String str){
        String storage = "";
        int length = str.length();
        int index = 0;
        while (index < length){
            char ch = str.charAt(index++);
            if (!storage.contains(String.valueOf(ch))){
                storage+="'"+ch+"',";
            }
        }
        return storage.substring(0,storage.length()-1);
    }
}
