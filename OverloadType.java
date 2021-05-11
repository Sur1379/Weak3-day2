package com.company.Weak3Day2;

public class OverloadType {
    public static void main(String[] args) {
        float d = 4.5f;
        printOverload(4 ,5 );
        printOverload1(7, d);
        printOverload3(d, 8);
    }
    public static void printOverload(int a, int b){
        System.out.println( a + " " + b);
    }
    public static void printOverload(int a, int b, int c){
        System.out.println( a + " " + b + " " + c);
    }
    public static void printOverload1(int a, int b){
        System.out.println( a + " " + b);
    }
    public static void printOverload1(int a, float b){
        System.out.println( a + " " + b);
    }
    public static void printOverload3(int a, float b){
        System.out.println( a + " " + b);
    }
    public static void printOverload3(float a, int b){
        System.out.println( a + " " + b);
    }
}
