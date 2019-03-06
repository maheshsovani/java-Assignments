package com.step.assignments;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(2.1231D, 2.1231D));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }
}
