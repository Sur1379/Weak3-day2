package com.company.Weak3Day2;

public class SameParamtres {
    public static void main(String[] args) {

        System.out.println(doSome(5));
    }
    public static float doSome(float a){
         float result = a;
         return result;
    }
    public static int doSome(int b){
        int result = b;
        return result;
    }
}
