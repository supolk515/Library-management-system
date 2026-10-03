package com.test;

public class DaysofMonths {
    public static int daysofmonths(int month){
        int day = 0;
        switch (month){
            case 2: day = 28; break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: day = 31; break;
            default: System.out.println("Error");
        }

        return day;
    }
}
