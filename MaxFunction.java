package com.company.Weak3Day2;

public class MaxFunction {
    public static void main(String[] args) {
        System.out.println(returnMaxValue(4, 5));
    }

    public static int returnMaxValue(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }

    public static int returnMaxValue(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > b) {
            max = c;
        }
        return max;
    }

    public static int returnMaxValue(int a, int b, int c, int d) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > b) {
            max = c;
        }
        if (d > c) {
            max = d;
        }
        return max;
    }
}
