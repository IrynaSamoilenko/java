package com.epam.hometasks.ht6;
import java.math.BigDecimal;

public class Book {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;
    private int year;
    private int pages;
    private double price;

    public Book(String name, String author, int year, int pages, int price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }
    public void setPages(int pages) { this.pages = pages; }
    public void setPrice(double price) { this.price = price; }

    public void viewBook() {
        System.out.println("ID: " + getId() +
                            "; Book: " + getName() +
                            "; Author: " + getAuthor()+
                            "; By: " + getYear() +
                            "; " + getPages() + " pages" +
                            "; " + getPrice() + "$ \n") ;
    }
}
