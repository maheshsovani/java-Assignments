package com.step.assignments.libraryAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Book mrutyunjay = new Book("Mrutyunjay");
        Book chhava = new Book("Chhava");
        Book rau = new Book("Rau");
        Book yayati = new Book("Yayati");
        Book shreemantYogi = new Book("ShreemantYogi");
        Book yugandhar = new Book("Yugandhar");

        Reader tushar = new Reader("Tushar");
        Reader mahesh = new Reader("Mahesh");

        Librarian librarian = new Librarian("Chandu");

        Map<String, Book> books = new HashMap<>();
        books.put(mrutyunjay.getName(), mrutyunjay);
        books.put(chhava.getName(), chhava);
        books.put(rau.getName(), rau);
        books.put(yayati.getName(), yayati);
        books.put(shreemantYogi.getName(), shreemantYogi);


        Set<Reader> readers = new HashSet<>();
        readers.add(tushar);
        readers.add(mahesh);
        readers.add(mahesh);


        Library library = new Library("Granthalay", books, readers, librarian);
        library.borrowBook(tushar, "Rau");

        library.addBook(librarian, yugandhar);

        library.borrowBook(tushar, "Yugandhar");
        library.borrowBook(tushar, "Yayati");

        library.getUserBooks(librarian, "Tushar");
        System.out.println(tushar.getBorrowedBooks());
    }
}