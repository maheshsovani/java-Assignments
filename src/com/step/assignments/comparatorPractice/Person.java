package com.step.assignments.comparatorPractice;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
