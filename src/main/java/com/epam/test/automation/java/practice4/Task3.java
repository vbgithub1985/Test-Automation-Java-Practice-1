package com.epam.test.automation.java.practice4;

public class Task3 {

    private Task3(){

    }

    public static void main(String[] args) {
        System.out.println(multiArithmeticElements(10,-4,20));
    }
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n<=0) throw new IllegalArgumentException();
        int result = 1;
        int a1Work = a1;
        for (int i = 0; i < n; i++) {
            result = result*a1Work;
            a1Work+=t;
         }
        return result;
    }
}
