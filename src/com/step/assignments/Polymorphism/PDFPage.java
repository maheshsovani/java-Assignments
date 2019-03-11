package com.step.assignments.Polymorphism;

public class PDFPage implements Console {
    public String print() {
        return "This is a some dummy string from the PDF Page";
    }


    public void display(String content) {
        System.out.println(content);
    }

    @Override
    public void click() {
    }

}
