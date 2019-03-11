package com.step.assignments.abstractClasses;

public abstract class Reader {
    public void read() {
        System.out.println("reading from the abstract class");
    }

    public abstract void isReadable();

    public abstract void canBeRead();

}
