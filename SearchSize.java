package com.company.Weak3Day2;

public class SearchSize {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(search(array, 5));
    }

    public static int search(int[] array) {
        int result = array.length;
        return result;
    }

    public static int search(int[] array, int N) {
        int result = 0;
        int i = 0;
        for (; i < array.length; i++) {
            if (N == array[i]) {
                break;
            }
        }
        return i;
    }
}
