package com.step.assignments.Polymorphism;

public class NonInteractiveWebPage implements Console {
    public String print() {
        return "This is a dummy String from the Non interative webpage.";
    }

    public void display(String content) {
        System.out.println(content);
    }

    @Override
    public void click() {

    }
}
