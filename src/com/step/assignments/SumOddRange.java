package com.step.assignments;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }

    public static boolean isOdd(int number) {
        if (number <= 0 || number % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }

        int sum = 0;


        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

