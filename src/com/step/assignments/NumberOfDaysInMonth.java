package com.step.assignments;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysinMonth(1,2019));
    }
    public static boolean isLeapYear(int year) {
        if (year < 0 || year > 9999) {
            return false;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static int getDaysinMonth(int month, int year) {
        if (year > 9999 || year < 1) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) return 29;
                return 28;
            default:
                return -1;
        }

    }
}

