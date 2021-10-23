package com.epam.test.automation.java.practice1;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        int result = 0;
        if (n<0) result = -n;
        if (n>0) result = n*n;
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        int result = 0;
        if (n >=100 && n <= 999){
            int num = n/10;
            int num1 = n % 10;
            int num2 = num%10;
            int num3 = num/10;

            if (num1<num2){
                int temp = num1;
                num1=num2;
                num2=temp;
            }
            if (num2<num3){
                int temp = num2;
                num2=num3;
                num3=temp;
            }
            result = result + (num1*100) + (num2 * 10) + num3;

        }else throw new IllegalArgumentException();
        return result;
    }

}
