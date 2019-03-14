package com.step.assignments.comparatorPractice;

import java.util.*;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Person mahesh = new Person("Mahesh", 20);
        Person athul = new Person("Athul", 20);

        List<Person> personHashMap = new ArrayList<>();


        personHashMap.add(mahesh);
        personHashMap.add(mahesh);
        personHashMap.add(athul);

        System.out.println(personHashMap);
        Collections.sort(personHashMap, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(personHashMap);
    }
}
