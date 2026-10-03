package com.test;
import java.util.Scanner;

public class ternaryOperator { //关系表达式？表达式1 ：表达式2  true -> 1

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
