package com.step.assignments;

enum Color {

    RED("The color is red"),
    GREEN("The color is green"),
    BLUE("The color is blue");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}

public class Enum {
    public static void main(String[] args) {
        String c1 = Color.RED.getColor();
        System.out.println(c1);
    }
}
