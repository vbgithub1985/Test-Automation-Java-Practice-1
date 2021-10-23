package com.epam.test.automation.java.practice2;

import org.junit.Assert;
import org.junit.Test;

import static com.epam.test.automation.java.practice2.Main.*;


public class MainTest {

    @Test
    public void testTask1(){
        int arg = 5698413;
        int expected = 18;
        int first = 56;
        Assert.assertEquals(expected, task1(arg));
        Assert.assertNotEquals(first, task1(arg));
    }

    @Test
    public void testTask2(){
        int arg = 128;
        int expected = 1;
        int first = 56;
        Assert.assertEquals(expected, task2(arg));
        Assert.assertNotEquals(first, task2(arg));
    }

    @Test
    public void testTask3(){
        int expected = 143;
        int first = 256;
       Assert.assertEquals(expected, task3(11));
       Assert.assertNotEquals(first, task3(11));
    }

}
