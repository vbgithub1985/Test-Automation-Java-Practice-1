package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Task1 {

    private static TaskHelper taskHelper;
    public Task1(){
        taskHelper = new TaskHelper();
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     *  IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array.length==0) throw new IllegalArgumentException();
        boolean isSorted = false;
        int[] arrSorted = taskHelper.getSortedArray(array, order);
        isSorted = taskHelper.compareTwoOneArrays(array, arrSorted);
        return isSorted;
    }
}
