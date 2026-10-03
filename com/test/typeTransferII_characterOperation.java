package com.test;

public class typeTransferII_characterOperation {//ASCII

    public static void main(String[] args){
        char c1 = 'A'; //c1 = 65
        char c2 = (char)(c1 + 32); //c1 + 32 == 97    (char)97 == 'a'
        System.out.println(c2);
    }
}
