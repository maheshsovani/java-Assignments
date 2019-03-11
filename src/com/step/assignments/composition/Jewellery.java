package com.step.assignments.composition;

public class Jewellery {
    private String metal;
    static int count;

    public Jewellery(String metal) {
        count++;
        this.metal = metal;
    }

    public int getCount() {
        return count;
    }
}
