package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Task1 {

    private Task1(){

    }



    public static void main(String[] args) {
        int[] arr1 = {8,7,6,5,4,3,2,1};;
        int[] arr2 = {8,7,6,5,4,3,2,1};
        System.out.println(isSorted(arr1, SortOrder.ASC));
        System.out.println(isSorted(arr1, SortOrder.DESC));
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array == null) throw new IllegalArgumentException();
        if (array.length==0) throw new IllegalArgumentException();

        boolean isSorted = false;
        int[] arrSorted = TaskHelper.getSortedArray(array, order);
        isSorted = TaskHelper.compareTwoOneArrays(array, arrSorted);
        return isSorted;
    }
}
