package com.step.assignments.Set;

import java.util.HashSet;
import java.util.Set;

public class NumberSet {
    private Set<Integer> numbers = new HashSet<>();

    public NumberSet(Set numbers) {
        this.numbers = numbers;
    }

    public void union(Set otherSet) {
        Set output = new HashSet(this.numbers);
        for (Object o : otherSet) {
            if (!output.contains(o)) {
                output.add(o);
            }
        }

        for (Object o : output) {
            System.out.println(o);
        }

    }

    public void difference(Set otherSet) {
        Set output = new HashSet(this.numbers);
        for (Object o : otherSet) {
            if (output.contains(o)) {
                output.remove(o);
            }
        }

        for (Object o : output) {
            System.out.println(o);
        }
    }

    public void intersection(Set otherSet) {
        Set output = new HashSet();
        for (Object o : otherSet) {
            if (this.numbers.contains(o)) {
                output.add(o);
            }
        }

        for (Object o : output) {
            System.out.println(o);
        }
    }
}
