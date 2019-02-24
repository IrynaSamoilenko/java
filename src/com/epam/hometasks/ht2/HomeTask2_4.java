package com.epam.hometasks.ht2;
import java.util.Scanner;
/**
 * Напишите программу на языке Java, которая вычисляет и выводит в
 * консоль сумму прибыли по заданному депозиту (например, 10000) на заданное
 * количество месяцев (например, 6) под указанный процент годовых (например,
 * 12%).
 */


public class HomeTask2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum of deposit -->");
        int deposit = sc.nextInt();
        System.out.println("Enter term (month) -->");
        int termMonth = sc.nextInt();
        System.out.println("Enter your rate -->");
        double rate = sc.nextInt();
        rate /=100;
        System.out.println(rate);
        int i = 0;
        double totalProfit = 0 ;
        while (i!=termMonth) {
            i++;
            double monthProfit = deposit*rate;
            deposit*=1+rate;
            totalProfit += monthProfit;
            System.out.println("Month#"+i+": sum of deposit = "+ deposit + "; "
                    + "month profit = "+ monthProfit + "; TOTAL PROFIT =  " + totalProfit);
        }
    }
}
