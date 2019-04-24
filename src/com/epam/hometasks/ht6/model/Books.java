package com.epam.hometasks.ht6.model;

import java.util.*;

public class Books {
    private ArrayList <Book> library;

    public String viewBooks() {
        try {
            return library.toString();
        } catch (NullPointerException exp) {
            return "The library is empty";
        }
    }

    public void addBook(Book newBook) { library.add(newBook);}


    public List<Book>  filterByAuthor (String author) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book: library){
            if (book.getAuthor().toLowerCase().contains(author)) {
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    public List<Book> filterByYear (int year) {
        List<Book> newLibrary = new ArrayList<>();
        for (Book book: library){
            if (book.getYear() <= year){
                newLibrary.add(book);
            }
        }
        return newLibrary;
    }

    private List<Book> getCopy(){
        List<Book> copyLib = new ArrayList<>();
        for(Book book: library){
            copyLib.add(book);
        }
        return copyLib;
    }

    public List<Book> sortByAuthor(){
        List<Book> newLib = getCopy();
        newLib.sort(Book.COMPARE_BY_AUTHOR);
        return newLib;
    }

    public List<Book> sortByPublisher(){
        List<Book> newLib = getCopy();
        newLib.sort(Book.COMPARE_BY_PUBLISHER);
        return newLib;
    }

    public List<Book> sortByPrice(){
        List<Book> newLib = getCopy();
        newLib.sort(Book.COMPARE_BY_PRICE);
        return newLib;
    }
}