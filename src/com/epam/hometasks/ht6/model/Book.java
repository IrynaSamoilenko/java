package com.epam.hometasks.ht6.model;


public class Book {
    private static int nextId = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public Book () {
        this.id = nextId++;
    }

    public Book(String name, String author, String publisher, int year, int pages, double price) {
        this(); //вызов конструктора по умолчанию
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public int getYear() { return year; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public void setYear(int year) { this.year = year; }
    public void setPages(int pages) { this.pages = pages; }
    public void setPrice(double price) { this.price = price; }


    public void setBookDiscount(double percent) {
        this.price = price*(1-percent/100);
    }

    public String viewBook() {
        return "ID: " + getId() +
                "; Book: " + getName() +
                "; Author: " + getAuthor()+
                "; Publisher: " + getPublisher()+
                "; By: " + getYear() +
                "; " + getPages() + " pages" +
                "; " + getPrice() + "$ \n";
    }
}
