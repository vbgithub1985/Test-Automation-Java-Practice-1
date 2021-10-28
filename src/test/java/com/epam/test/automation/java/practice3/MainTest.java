package com.epam.test.automation.java.practice3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.test.automation.java.practice3.Main.*;

public class MainTest {

    @Test
    public void testTask1(){
        int[] arrSource = {100, 2, 3, 45, 33, 8, 4, 54};
        int[] arrDest = {54, 4, 3, 45, 33, 8, 2, 100};
        Assert.assertEquals(task1(arrSource), arrDest);
    }

    @Test
    public void testTask2(){
        int[] arrSource = {10, 10, 10, 10, 10, 1000, 10, 25, 30, 1000, 6, 1000, 56, 1000};
        int result = 8;
        Assert.assertEquals(task2(arrSource), result);
    }

    @Test
    public void testTask3(){
        int[][] arrSource = {{6, 3, 4, 1, 20},  {7, 5, 1, 2, 3},  {4, 6, 10, 7, 77},  {4, 3, 11, 8, 55},  {5, 6, 7, 8, 66}};
        int[][] arrDest = {{6, 1, 1, 1, 1},  {0, 5, 1, 1, 1},  {0, 0, 10, 1, 1},  {0, 0, 0, 8, 1},  {0, 0, 0, 0, 66}};
        Assert.assertEquals(task3(arrSource), arrDest);
    }

}
