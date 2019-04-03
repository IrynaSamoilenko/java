package com.epam.hometasks.ht6.model;


public class Books {
    private int counter = 0;
    private Book[] library;


    public Books(int librarySize) {
        this.library = new Book[librarySize];
    }

    public String viewBooks() {
        if (counter ==0 ){
            return "The library is empty";
        }
        String books = "";
        for(int i=0; i<counter; i++) {
            books += library[i].viewBook() + "\n";
        }
        return books;
    }

    public boolean addBook(Book newBook) {
       if (counter >= library.length) {
           return false;
       }
       library[counter++] = newBook;
       return true;
    }

    public Books searchByAuthor (String inputedAuthor) {
        Books newBooks = new Books(counter);
        for (int i=0; i<counter; i++) {
            if(library[i].getAuthor().equalsIgnoreCase(inputedAuthor)){
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

    public Books searchByYear (int inputedYear) {
        Books newBooks = new Books(counter);
        for (int i=0; i<counter; i++) {
            if(library[i].getYear()>inputedYear){
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

    public void setDiscount(double inputedDiscount) {
        System.out.println("Set a discount to" + inputedDiscount + "%");
        for(int i=0; i<counter; i++) {
            library[i].setBookDiscount(inputedDiscount);
        }
    }

}
