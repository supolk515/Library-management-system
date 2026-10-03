package com.test;

public class Factorial {
    public static int factorial (int n){
        if (n < 0){
            return -1;
        }else if (n == 0){
            return 0;
        }else{
            int fac = 1;
            for (int i = 1; i <= n; i++){
                fac = fac * i;
            }
            return fac;
        }
    }
}
