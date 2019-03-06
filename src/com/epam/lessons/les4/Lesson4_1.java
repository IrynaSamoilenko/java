package com.epam.lessons.les4;

/**
 * By Samoilenko Iryna
 * Created 04/03/2019
 */
public class Lesson4_1 {
    public static void main(String[] args) {
        String str = "123543666";
        //String result = subStr(str);
        System.out.println("Res -> " + subStr(str));
    }
    public static String subStr(String str){
        if(str == null || str.length() <= 1){
            return null;
        }
        return str.substring(str.length()/2);
    }

}
