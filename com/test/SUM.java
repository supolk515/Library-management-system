package com.test;
import java.util.Scanner;

public class SUM {
    public static int sum (){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int dx;
        do{
            dx = sc.nextInt();
            sum += dx;
        }while(dx != 0);
        return sum;
    }
}
