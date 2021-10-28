package com.epam.test.automation.java.practice3;

import java.util.Arrays;

public class Main {

    private Main(){

    }

    public static void main(String[] args) {
        /*System.out.println("First array");
        int[] arr = {10, 5, 3, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(task1(arr)));
        System.out.println("Second array");
        int[] arr2 = {100, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(task1(arr2)));
        System.out.println("Third array");
        int[] arr3 = {100, 2, 3, 45, 33, 8, 4, 54};
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(task1(arr3)));*/

        /*System.out.println("First array");
        int[] arr = {4, 100, 3, 4};
        System.out.print(Arrays.toString(arr) + ". Result = ");
        System.out.println(task2(arr));
        System.out.println("Second array");
        int[] arr2 = {5, 50, 50, 4, 5};
        System.out.print(Arrays.toString(arr2) + ". Result = ");
        System.out.println(task2(arr2));
        System.out.println("Third array");
        int[] arr3 = {5, 350, 350, 4, 350};
        System.out.print(Arrays.toString(arr3) + ". Result = ");
        System.out.println(task2(arr3));
        System.out.println("Forth array");
        int[] arr4 = {10, 10, 10, 10, 10, 1000, 10, 25, 30, 1000, 6, 1000, 56, 1000};
        System.out.print(Arrays.toString(arr4) + ". Result = ");
        System.out.println(task2(arr4));*/

        //int[][] matrix = {{2, 4, 3, 3},  {5, 7, 8, 5},  {2, 4, 3, 3},  {5, 7, 8, 5}};
        int[][] matrix = {{6, 3, 4, 1, 20},  {7, 5, 1, 2, 3},  {4, 6, 10, 7, 77},  {4, 3, 11, 8, 55},  {5, 6, 7, 8, 66}};
        System.out.println("Source array");
        printMatrix(matrix);
        System.out.println("Result array");
        printMatrix(task3(matrix));
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        int iFirst = 0;
        int iLast = array.length-1;
        while (iFirst < iLast){
            int first = array[iFirst];
            int last = array[iLast];
            if (first % 2 ==0 && last % 2 ==0){
                int temp = array[iFirst];
                array[iFirst] = array[iLast];
                array[iLast] = temp;
            }
            iFirst++;
            iLast--;
        }
        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        int iFirstMax = 0;
        int iLastMax = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) max = array[i];
        }
        int countMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                if (countMax == 0) {
                    iFirstMax = i;
                    iLastMax = i;
                } else iLastMax = i;
                countMax++;
            }
        }
        return iLastMax - iFirstMax;
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int[][] task3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i<j) {
                    matrix[i][j] = 1;
                }else if (i>j){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");

        }
    }



}
