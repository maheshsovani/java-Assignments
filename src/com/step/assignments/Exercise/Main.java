package com.step.assignments.Exercise;

public class Main {
    public static void main(String[] args) {
        NumberRange numberRange = new NumberRange(1, 10);
        AlphabetRange charRange = new AlphabetRange('a', 'z');

        System.out.println(charRange.getAll());
        System.out.println(charRange.containsElement('9'));
        System.out.println(numberRange.getAll());
        System.out.println(numberRange.containsElement(105));
    }
}
