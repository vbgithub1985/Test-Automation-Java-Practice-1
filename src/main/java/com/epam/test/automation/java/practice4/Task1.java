package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Task1 {

    private Task1(){

    }



    public static void main(String[] args) {
        int[] arr1 = {3,8,7,6,5,4,3,2,1};;
        int[] arr2 = {8,7,6,5,4,3,2,1,10};
        int[] arr3 = {9,1,2,3,4,5,6,7,8};
        System.out.println(isSorted2(arr2, SortOrder.ASC));
        System.out.println(isSorted2(arr2, SortOrder.DESC));
        System.out.println(isSorted2(arr1, SortOrder.DESC));
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted2(int[] array, SortOrder order) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length==0) throw new IllegalArgumentException();

        boolean isSorted = false;
        if (order == SortOrder.ASC){
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]) isSorted = true;
                else {
                    isSorted = false;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) isSorted = true;
                else {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }
    
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length==0) throw new IllegalArgumentException();

        boolean isSorted = false;
        int[] arrSorted = TaskHelper.getSortedArray(array, order);
        isSorted = TaskHelper.compareTwoOneArrays(array, arrSorted);
        return isSorted;
    }
}
