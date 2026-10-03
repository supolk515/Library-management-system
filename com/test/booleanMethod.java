package com.test;
import java.util.Scanner;

public class booleanMethod {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = a >= 1 && a <= 10;
        System.out.println(b);
    }
}
