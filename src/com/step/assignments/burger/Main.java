package com.step.assignments.burger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 9, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        ArrayList<Object> objects = new ArrayList<>();
    }

}
