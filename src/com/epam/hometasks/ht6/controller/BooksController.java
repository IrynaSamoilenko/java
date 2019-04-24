package com.epam.hometasks.ht6.controller;

import com.epam.hometasks.ht6.model.Books;
import com.epam.hometasks.ht6.model.SourceData;
import com.epam.hometasks.ht6.view.OutputView;
import com.epam.hometasks.ht6.utils.InputUtil;
import com.epam.hometasks.ht6.view.MenuView;
import com.epam.hometasks.ht6.view.OutputView;


public class BooksController {
    private Books books;

    private OutputView printMes = new OutputView();


    public void run() {
       printMes.print(MenuView.START_MENU_NAVIGATION);
       int choice = InputUtil.inputInt();
       printMes.print(OutputView.ENTER_LIBRARY_NAME);
       String path = InputUtil.inputString().toLowerCase();
       SourceData sd = new SourceData(path);
       switch (choice) {
           case 1:
               sd.readFile();
               break;
           case 2:
               sd.writeFile();



       }


    }
}

