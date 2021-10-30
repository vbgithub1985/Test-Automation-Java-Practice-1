package com.epam.test.automation.java.funcs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        swap(x, y);
        System.out.println("After swap x = " + x);
        System.out.println("After swap y = " + y);
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        System.out.println(Arrays.toString(arr));
        getSwapArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void getSwapArr(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap x = " + x);
        System.out.println("After swap y = " + y);
    }
}
