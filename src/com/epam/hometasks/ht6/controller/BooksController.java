package com.epam.hometasks.ht6.controller;

import com.epam.hometasks.ht6.model.Books;
import com.epam.hometasks.ht6.view.BookView;
import com.epam.hometasks.ht6.utils.InputUtil;


public class BooksController {
    private Books books;
    private BookView bookView = new BookView();

    public void run() {
        bookView.print("Enter library size ->");
        books = new Books(InputUtil.inputInt());

    //actions
        bookView.print(books.viewBooks());

        bookView.print("\n Enter the discount percent in range 1-99 ->");
        books.setDiscount(InputUtil.inputDouble());
        bookView.print(books.viewBooks());

        bookView.print("\n Enter author to search ->");
        Books findByAuthorBooks = books.searchByAuthor(InputUtil.inputString());
        bookView.print(findByAuthorBooks.viewBooks());
    }
}
