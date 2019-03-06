package com.epam.lessons.les4;

/**
 * Created by Samoilenko Iryna
 * 03/03/2019
 */

public class Lesson4_2 {
    public static void main(String[] args) {
        String str1 = "Tomcat";
        String str2 = "Caat";
        System.out.println("Chars -> " + findCharacters(str1, str2));
    }
    public static String findCharacters(String str1, String str2){
        String conStr = "";
        int index = 0;
        int len1 = str1.length();
        while (index < len1){
            char ch = str1.charAt(index++);
            if (str2.contains(String.valueOf(ch)) && !conStr.contains((String.valueOf(ch)))){
                conStr+=ch;
            }
        }
        return conStr;
    }
}
