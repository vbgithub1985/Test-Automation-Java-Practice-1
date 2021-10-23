package com.epam.test.automation.java.practice2;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(task3(n));
        /*System.out.println(task1(n));
        n = 14;
        System.out.println(task2(n));
        n = 9635;
        System.out.println(task2(n));*/

    }

    public static int task1(int value) {
        if (value <= 0) throw new IllegalArgumentException();
        int result = 0;
        while(value>0){
            int n = value%10;
            if (n%2!=0) result = result+n;
            value = value/10;
        }
        return result;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        if (value < 0) throw new IllegalArgumentException();
        int result = 0;
        while (value != 0){
            int n = value%2;
            if (n==1) result++;
            value=value / 2;
        }
        return result;
    }

    /**
     For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
     Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
     preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0",
     the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
     Example,
     n = 8 result = 33
     n = 11 result = 143
     */
    public static int task3(int value) {
        if (value <= 0) throw new IllegalArgumentException();
        if (value == 1) return 0;
        if (value == 2) return 1;
        int result = 0;
        int fib = 1;
        int fibpr = 1;
        result = fibpr + fib;
        for (int i = 3; i < value; i++) {
            int fibTemp = fib;
            fib = fib+fibpr;
            fibpr = fibTemp;
            result = result + fib;
        }
        return result;
    }



}
