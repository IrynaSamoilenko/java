package com.epam.hometasks.ht6.view;

public class OutputView {

    public static final String ENTER_NAME = "ENTER BOOK'S NAME --> ";
    public static final String ENTER_AUTHOR = "ENTER AUTHOR --> ";
    public static final String ENTER_PUBLISHER = "ENTER PUBLISHER --> ";
    public static final String ENTER_YEAR = "ENTER YEAR --> ";
    public static final String ENTER_PAGES = "ENTER NUMBER OF PAGES --> ";
    public static final String ENTER_PRICE = "ENTER PRICE --> ";
    public static final String ENTER_LIBRARY_NAME = "ENTER LIBRARY NAME --> ";

    public static final String ENTER_SET_PERCENT = "SET A DISCOUNT (ENTER NUMBER OF PERCENT) --> ";
    public static final String ENTER_SEARCH_BY_AUTHOR = "ENTER AUTHOR'S SURNAME TO SEARCH --> ";


    public void print(String text){
        System.out.println(text);
    }
}
