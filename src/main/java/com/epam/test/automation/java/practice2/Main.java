package com.epam.test.automation.java.practice2;

public class Main {

    private Main(){

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
