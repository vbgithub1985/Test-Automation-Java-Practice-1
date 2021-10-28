package com.epam.test.automation.java.practice3;

import java.util.Arrays;

public class Main {

    private Main(){

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
