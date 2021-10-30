package com.epam.test.automation.java.practice4;

public class Task4 {

    private Task4(){

    }
    public static void main(String[] args) {
        System.out.println(sumGeometricElements(1, 0.9, -1));
       // System.out.println(sumGeometricElements(100,0.25,20));
        //System.out.println(sumGeometricElements(100,0.75,20));
    }

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t<=0 || t>=1) throw new IllegalArgumentException();
        if (a1<=alim)  throw new IllegalArgumentException();
        if (alim<0)  throw new IllegalArgumentException();
        double result = 0;
        double a1Work = a1;
        while(a1Work>alim){
            result+=a1Work;
            a1Work = a1Work*t;
            if (a1Work<=0.0002) break;
        }
        return Math.round(result);
    }
}
