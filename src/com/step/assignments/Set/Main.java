package com.step.assignments.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);

        Set<Integer> numbers2 = new HashSet<>();
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);

        NumberSet numberSet = new NumberSet(numbers1);
        numberSet.union(numbers2);
        System.out.println("-------------------");
        numberSet.intersection(numbers2);

    }
}
