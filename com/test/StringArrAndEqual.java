package com.test;
import java.util.Arrays;

public class StringArrAndEqual {
    public static void main (String[] args) {
        int number = InputReader.readInt("How many strings do you want to store in the array?");
        String[] strings = new String[number];

        // TODO: read strings with a for loop using InputReader.readString("Enter string " + (i + 1));
        for (int i = 0; i < number; i++){
            strings[i] = InputReader.readString("Enter string " + (i + 1));
        }

        String searchWord = InputReader.readString("Which string would you like to search?");

        // TODO: invoke has with the correct parameters
        boolean found = Has.has(strings,searchWord);
        System.out.println("Found " + searchWord + " in " + Arrays.toString(strings) + ": " + found);
    }
}
