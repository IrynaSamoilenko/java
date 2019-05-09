package com.epam.hometasks.ht6.utils;
import com.epam.hometasks.ht6.view.OutputView;
import com.epam.hometasks.ht6.model.Book;
import java.util.Scanner;


public class InputUtil {
    private OutputView printMes = new OutputView();
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        return sc.nextInt();
    }

    public static double inputDouble() {
        return sc.nextDouble();
    }

    public static String inputString() {
        return sc.nextLine();
    }



}
