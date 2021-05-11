package com.company.Weak3Day2;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        calculateCelsius(32.0f , 2);
    }

    public static void calculateCelsius(float fahr, int choice) {
        float celsius = (fahr - 32) * 5 / 9;
        if (choice == 1) {
            System.out.println((int) celsius);
        } else if (choice == 2) {
            System.out.println((double) celsius);
        } else {
            System.out.println("illegal choice");
        }

    }

    public static void calculateCelsius(int choice, float fahr) {
        float fahrenheit = (fahr * 9 / 5) + 32;
        System.out.println((int) fahrenheit);
    }
}
