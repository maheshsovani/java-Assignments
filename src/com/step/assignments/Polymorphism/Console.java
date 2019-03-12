package com.step.assignments.Polymorphism;

public class Console implements Display {

    @Override
    public String print() {
        return null;
    }

    public void display(String content) {
        System.out.println(content);
    }

    @Override
    public void click() {

    }
}
