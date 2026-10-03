package com.test;

import java.util.Scanner;

public class divided_value {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a 3-digit number");

        int num = sc.nextInt();
        int a = num / 100;
        int b = num / 10 % 10;
        int c = num % 10;
        System.out.println(a+" "+b+" "+c);
    }
}
/*
98123 / 10000 = 9
98123 / 1000 % 10 = 8
98123 / 100 % 10 = 1
98123 / 10 % 10 = 2
98123 % 10 = 3
 */

