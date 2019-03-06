package com.step.assignments;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(30112));
    }
    public static int sumFirstAndLastDigit(int num){
        if(num < 0){
            return -1;
        }
        int lastDigit = num%10;
        char firstChar =(""+num).charAt(0);
        int firstDigit = Character.getNumericValue(firstChar);
        return lastDigit+firstDigit;
    }
}
