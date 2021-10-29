package com.epam.test.automation.java.practice4;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {8,7,6,5,4,3,2,1};
        Task1 task1 = new Task1();
        System.out.println(task1.isSorted(arr1, SortOrder.ASC));
        System.out.println(task1.isSorted(arr1, SortOrder.DESC));
    }

}
