package com.epam.hometasks.ht6.controller;

import com.epam.hometasks.ht6.model.Book;
import com.epam.hometasks.ht6.model.Books;
import com.epam.hometasks.ht6.model.SourceData;
import com.epam.hometasks.ht6.view.OutputView;
import com.epam.hometasks.ht6.utils.InputUtil;
import com.epam.hometasks.ht6.view.MenuView;
import com.epam.hometasks.ht6.view.OutputView;

import java.io.IOException;


public class BooksController {
    private Books books;

    private OutputView printMes = new OutputView();


    public void run() {
       printMes.print(MenuView.START_MENU_NAVIGATION);
       int choice = InputUtil.inputInt();

       switch (choice) {
           case 1:
               //OutputView.print(OutputView.ENTER_LIBRARY_NAME);
               String path = InputUtil.inputString();
               SourceData sd = new SourceData(path);
               System.out.println("Created");
               printMes.print(MenuView.GEN_MENU_NAVIGATION);
               int choiceNext = InputUtil.inputInt();
               switch (choiceNext){
                   case 1:
                       sd.readFile();
                       break;
                   case 2:
                       try {
                           books.addBook(getBookData());
                       } catch (IOException exp) {
                           exp.getMessage();
                       }

               }
               break;
           case 2:
               printMes.print(OutputView.ENTER_LIBRARY_NAME);
               String pathToRead = InputUtil.inputString().toLowerCase();
               SourceData sdToRead = new SourceData(pathToRead);
               sdToRead.readFile();
               break;
       }


    }
    public Book getBookData() throws IOException {
        printMes.print(OutputView.ENTER_NAME);
        String name = InputUtil.inputString();
        printMes.print(OutputView.ENTER_AUTHOR);
        String author = InputUtil.inputString();
        printMes.print(OutputView.ENTER_PUBLISHER);
        String publisher = InputUtil.inputString();
        printMes.print(OutputView.ENTER_YEAR);
        String year = InputUtil.inputString();
        printMes.print(OutputView.ENTER_PRICE);
        String price = InputUtil.inputString();
        printMes.print(OutputView.ENTER_PAGES);
        String pages = InputUtil.inputString();
        Book book = new Book(name, author, publisher, year, pages, price);
        return book;
    }
}

