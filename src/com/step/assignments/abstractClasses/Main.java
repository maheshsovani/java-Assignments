package com.step.assignments.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Reader fIleReader = new FIleReader();
        fIleReader.canBeRead();

        Reader Streamreader = new StreamReader();
        Streamreader.canBeRead();

    }
}
