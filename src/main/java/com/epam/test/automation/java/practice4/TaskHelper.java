package com.epam.test.automation.java.practice4;

public class TaskHelper {

    private TaskHelper(){

    }
    public static int[] getSortedArray(int[] arrSource, SortOrder order){
        int[] arrResult;
        if (order == SortOrder.ASC){
            arrResult = getSortedAscArray(arrSource);
        }
        else{
            arrResult = getSortedDescArray(arrSource);
        }
        return arrResult;
    }

    public static boolean compareTwoOneArrays(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) throw new IllegalArgumentException();
        boolean result = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] transform(int[] arrSource){
        int[] arrResult = getNewOneArrayFromSource(arrSource);
        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = arrResult[i]+i;
        }
        return arrResult;
    }

    public static int[] getNewOneArrayFromSource(int[] arrSource){
        int[] arrResult = new int[arrSource.length];
        for (int i = 0; i < arrSource.length; i++) {
            arrResult[i] = arrSource[i];
        }
        return arrResult;
    }

    private static int[] getSortedAscArray(int[] arrSource){
        int[] arrResult = getNewOneArrayFromSource(arrSource);
        for (int i = 0; i < arrResult.length; i++) {
            for (int j = 0; j < arrResult.length-1; j++) {
               if (arrResult[i]<arrResult[j]){
                    changeElements(arrResult, i, j);
               }
            }
        }
        return arrResult;
    }

    private static int[] getSortedDescArray(int[] arrSource){
        int[] arrResult = getNewOneArrayFromSource(arrSource);
        for (int i = 0; i < arrResult.length; i++) {
            for (int j = 0; j < arrResult.length-1; j++) {
                if (arrResult[i]>arrResult[j]){
                    changeElements(arrResult, i, j);
                }
            }
        }
        return arrResult;
    }

    private static void changeElements(int[] arrSource, int i, int j){
        int temp = arrSource[j];
        arrSource[j] = arrSource[i];
        arrSource[i] = temp;
    }

}
