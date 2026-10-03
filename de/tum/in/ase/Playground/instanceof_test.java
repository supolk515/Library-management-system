package de.tum.in.ase.Playground;

class X{

}

public class instanceof_test {
     public static void main(String[] args){
         String s = "hello world";
         System.out.println(s instanceof String);
         X x =  new X();
         System.out.println(x instanceof X);
     }

}
