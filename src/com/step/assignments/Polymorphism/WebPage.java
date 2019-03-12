package com.step.assignments.Polymorphism;

public class WebPage implements Display {
    public String print() {
        return "This is some dummy string from Web Page";
    }

    public void click() {
        System.out.println("You have clicked on this page.");
    }

    public void display(String content) {
        System.out.println(content);
    }
}
