package com.step.assignments;

public class NumbersToWords {
    public static void main(String[] args) {
        numberToWords(1234);
        System.out.println(reverse(-2));
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int newNumber = reverse(number);

        for (int count = 0; count < getDigitCount(number); count++) {
            int digit = newNumber % 10;
            newNumber = newNumber / 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int length = String.valueOf(number).length();
        return length;
    }

    public static int reverse(int number) {
        int num = 1;
        if (number < 0) {
            num = -1;
            number *= -1;
        }
        int length = getDigitCount(number);
        int remainingNumber = 0;
        for (int i = length - 1; i > -1; i--) {
            int unitDigit = number % 10;
            number = number / 10;
            remainingNumber = (int) (remainingNumber + unitDigit * Math.pow(10, i));
        }
        return remainingNumber * num;
    }

}
