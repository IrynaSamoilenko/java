package com.epam.hometasks.ht6;
import com.epam.hometasks.ht6.model.Book;
import com.epam.hometasks.ht6.model.Books;

import com.epam.hometasks.ht6.controller.BooksController;

public class Main {
    public static void main(String[] args) {
        new BooksController().run();
    }
}




//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Books library = new Books(10);
//        Book testBook = new Book("First book", "name", 1995, 345, 99);
//        library.addBook(testBook);
//        choice(menu(), library);
//
//    }
//    static Scanner scan() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
//    }
//
//    public static int menu () {
//        System.out.println("PLEASE ENTER AN ACTION:" +
//                "\n 1 - show all books in library" +
//                "\n 2 - add the book" +
//                "\n 3 - search by author" +
//                "\n 4 - search after entered year" +
//                "\n 5 - set a discount for all books in library" +
//                "\n 6 - exit" +
//                "\n" +
//                "\n YOUR CHOICE -->  ");
//        int userAction = scan().nextInt();
//        return userAction;
//    }
//
//    static void choice (int userAction, Books library) {
//        switch (userAction) {
//            case (1): {
//                library.viewAll();
//                System.out.println("\n");
//                choice(menu(), library);
//                break;
//            }
//            case (2): {
//                System.out.println("Enter book's name (without quaters) -> ");
//                String inputedName = scan().nextLine().trim();
//
//                System.out.println("Enter book's author ->" );
//                String inputedAuthor = scan().nextLine().trim();
//
//                System.out.println("Enter year -> ");
//                int inputedYear = scan().nextInt();
//
//                System.out.println("Enter number of pages -> ");
//                int inputedPages = scan().nextInt();
//
//                System.out.println("Enter price in $ -> ");
//                int inputedPrice = scan().nextInt();
//
//                Book newBook = new Book(inputedName, inputedAuthor, inputedYear, inputedPages, inputedPrice);
//
//                library.addBook(newBook);
//
//                System.out.println("Added!\n");
//                choice(menu(), library);
//                break;
//            }
//            case (3): {
//                System.out.println("Enter author name for search -> ");
//                String inputedAuthor = scan().nextLine();
//                library.searchByAuthor(inputedAuthor);
//
//                System.out.println("\n");
//                choice(menu(), library);
//                break;
//            }
//            case (4): {
//                System.out.println("Enter the started year -> ");
//                int inputedYear = scan().nextInt();
//                library.searchByYear(inputedYear);
//
//                System.out.println("\n");
//                choice(menu(), library);
//                break;
//            }
//            case (5): {
//                System.out.println("Enter the discount percent in range 1-99 -> ");
//                int inputedDiscount = scan().nextInt();
//                library.setDiscount(inputedDiscount);
//
//                System.out.println("The discount " + inputedDiscount + " % was set for all prices!");
//                System.out.println("\n");
//                choice(menu(), library);;
//                break;
//            }
//            case (6) : {
//                break;
//            }
//            default: {
//                System.out.println("-----Non valid action-----");
//                System.out.println("\n");
//                choice(menu(), library);
//            }
//        }
//
//    }
//
//    public void myMethod(){
//
//    }
//
//
//}
