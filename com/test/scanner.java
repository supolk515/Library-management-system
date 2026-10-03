package com.test;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {//main function

        Scanner sc = new Scanner(System.in);//start input

        int num = sc.nextInt();//input integer
        System.out.println(num);//output integer

        double num2  = sc.nextDouble();//input floating-point number
        System.out.println(num2);//output floating-point number

        String str = sc.next();//input string
        System.out.println(str);//output string
    }
}
