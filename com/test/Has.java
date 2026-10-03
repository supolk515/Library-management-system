package com.test;

public class Has {
    public static boolean has(String[] str, String s){
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(s)){    //str[i].equals(s)
                return true;
            }
        }
        return false;
    }
}
