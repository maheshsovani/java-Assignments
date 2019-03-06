package com.step.assignments;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers :");
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner userInput = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (userInput.hasNextInt()) {
            sum += userInput.nextInt();
            counter++;
        }
        int average = Math.round(sum / (float) (counter));
        System.out.println("SUM = " + sum + " AVG = " + average);

    }

}
