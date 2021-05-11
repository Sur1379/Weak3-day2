package com.company.Weak3Day2;

import java.util.Arrays;

public class PrintArrays {
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(float[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        float [] array = {1.5f, 1.7f, 5.4f, 7.8f, 8.1f};
           printArray(array);
    }

}

