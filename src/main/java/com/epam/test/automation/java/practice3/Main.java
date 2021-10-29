package com.epam.test.automation.java.practice3;

import java.util.Arrays;

public class Main {

    private Main(){

    }

    public static void main(String[] args) {
        int[][] arr = {{3,4,6,2},{1,6,8,99},{5,66,77,5},{44,55,66,99}};
        printMatrix(arr);
        printMatrix(task3(arr));
        printMatrix(arr);
    }

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        int[] arrResult = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrResult[i] = array[i];
        }
        int iFirst = 0;
        int iLast = arrResult.length-1;
        while (iFirst < iLast){
            int first = arrResult[iFirst];
            int last = arrResult[iLast];
            if (first % 2 ==0 && last % 2 ==0){
                int temp = arrResult[iFirst];
                arrResult[iFirst] = arrResult[iLast];
                arrResult[iLast] = temp;
            }
            iFirst++;
            iLast--;
        }
        return arrResult;
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
        int[][] arrResult = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arrResult[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < arrResult.length; i++) {
            for (int j = 0; j < arrResult.length; j++) {
                if (i<j) {
                    arrResult[i][j] = 1;
                }else if (i>j){
                    arrResult[i][j] = 0;
                }
            }
        }
        return arrResult;
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
