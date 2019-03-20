package com.epam.hometasks.ht6;
import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public Book[] booksLibrary;
    public String libraryName;
    public int librarySize;
    public static int discount;

    final String NO_SEARCH_RESULT = "No such results in search";

    static Scanner scan() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public void resultCounter(int counter) {
        if (counter == 0){
            System.out.println(NO_SEARCH_RESULT);
        } else {
            System.out.println("Total results: " + counter + " books.");
        }
    }

    public Books() {
        //System.out.println("Enter library's name (without quaters) -> ");
        //String libraryName = scan().nextLine().trim();
        this.libraryName = "Name";

        //System.out.println("Enter number of books ->");
        //int librarySize = scan().nextInt();
        this.librarySize = 10;

        this.booksLibrary = new Book[librarySize];
    }

    public void viewAll() {
        for (Book pos : booksLibrary) {
            int counter = 0;
            if (pos == null) {
                break;
            } else {
                counter++;
                pos.viewBook();
            }
            resultCounter(counter);
        }
    }

    public void addBook(Book newBook) {
        if (Arrays.asList(booksLibrary).contains(newBook)) {
            System.out.println("This book is already in library!");
        } else {
            for (int i = 0; i < booksLibrary.length; i++) {
                if (booksLibrary[i] == null) {
                    booksLibrary[i] = newBook;
                    break;
                } else {
                    i++;
                }

            }
        }
    }

    public void searchByAuthor (String inputedAuthor) {
        for (Book pos: booksLibrary) {
            int counter = 0;
            if (pos == null) {
                break;
            } else if (pos.getAuthor().contentEquals(inputedAuthor)) {
                counter++;
                pos.viewBook();

            }
           resultCounter(counter);
        }
    }

    public void searchByYear (int inputedYear) {
        for (Book pos: booksLibrary) {
            int counter = 0;
            if (pos == null) {
                break;
            } else if (pos.getYear() >= inputedYear) {
                counter++;
                pos.viewBook();

            }
            resultCounter(counter);
        }
    }

    public void setDiscount(int inputedDiscount) {
        for (Book pos: booksLibrary) {
            int counter = 0;
            if (pos == null) {
                break;
            } else {
                counter++;
                double price = pos.getPrice()*(1-(double)inputedDiscount/100);
                System.out.println(price);
                pos.setPrice(price);

            }
            resultCounter(counter);
        }
    }

}
