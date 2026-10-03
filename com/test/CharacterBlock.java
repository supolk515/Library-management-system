package com.test;

public class CharacterBlock {
    public static void characterBlock(int width, int height){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}
