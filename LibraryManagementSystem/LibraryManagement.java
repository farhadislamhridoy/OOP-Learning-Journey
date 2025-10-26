package com.farhadislam.Knapsack.LibraryManagement;

public class LibraryManagement {
    static void main() {
        Book ebook = new Ebook("Java Basics", "John Doe", 20.0, 5.5);
        Book printedBook = new PrintedBook("OOP Concepts", "Jane Smith", 25.0, 300);

        int days = 5;

        // Display details and total cost for each
        System.out.println("EBook Details: " + ebook.getDetails());
        System.out.println("Total Borrowing Cost for " + days + " days: $" + ebook.calculatePrice(days));

        System.out.println("\nPrintedBook Details: " + printedBook.getDetails());
        System.out.println("Total Borrowing Cost for " + days + " days: $" + printedBook.calculatePrice(days));
    }
}
