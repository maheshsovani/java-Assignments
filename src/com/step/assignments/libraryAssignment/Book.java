package com.step.assignments.libraryAssignment;


public class Book {
    private String name;
    private boolean isBorrwed;
    private Reader reader;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void changeReader(Reader reader) {
        this.reader = reader;
    }

    public void borrowBook(Reader reader) {
        this.isBorrwed = true;
        changeReader(reader);
    }

    public void returnBook() {
        this.isBorrwed = false;
        this.reader = null;
    }

    @Override
    public String toString() {
        if (isBorrwed){
            return "Name : " + this.getName() + "\nisBorrowed : " + this.isBorrwed + "\nReader :" + reader.getName();
        }
        return "Name : " + this.getName() + "\nisBorrowed : " + this.isBorrwed + "\nReader : Null";
    }

}
