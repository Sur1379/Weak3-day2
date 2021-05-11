package com.company.Weak3Day2;

public class SquareOf {
    public static void main(String[] args) {
        System.out.println(square(5.4f));
    }

    public static double square(int a) {
        double result = Math.PI * a * a;
        return result;
    }

    public static double square(float a) {
        double result = a * a;
        return result;
    }

    public static double square(int a, int b) {
        double result = a * b;
        return result;
    }
}
