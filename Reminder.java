package com.company.Weak3Day2;

public class Reminder {
    public static void main(String[] args) {
        System.out.println(printSum(1234, 2));
    }
    public static int printSum(int num){
        int sum = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.charAt(i) + "";
            sum = sum + Integer.parseInt(s1);
        }
        return sum;
    }
    public static int printSum(int num, int r){
        int sum = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.charAt(i) + "";
            sum = sum + Integer.parseInt(s1);
        }
        return sum % r;
    }
}
