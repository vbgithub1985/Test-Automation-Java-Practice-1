package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Task2 {


    private Task2(){

    }

    public static void main(String[] args) {
        int[] arr1 = {15, 10, 3};
        int[] arr2 =  {15, 10, 3};
        System.out.println(Arrays.toString(transform(arr1,SortOrder.ASC)));
        System.out.println(Arrays.toString(transform(arr2,SortOrder.ASC)));
        System.out.println(Arrays.toString(transform(arr2,SortOrder.DESC)));
    }
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (array == null) throw new IllegalArgumentException();
        boolean isSorted;
        if (order == SortOrder.ASC){
            isSorted = Task1.isSorted(array, SortOrder.ASC);
        }
        else{
            isSorted = Task1.isSorted(array, SortOrder.DESC);
        }
        if (isSorted) return TaskHelper.transform(array);
        else return TaskHelper.getNewOneArrayFromSource(array);

    }
}
