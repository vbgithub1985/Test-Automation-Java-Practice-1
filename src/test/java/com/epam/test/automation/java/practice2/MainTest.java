package com.epam.test.automation.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.test.automation.java.practice2.Main.*;


public class MainTest {

    @Test
    public void testTask1(){
        int arg = 5698413;
        int expected = 18;
        int first = 56;
        Assert.assertEquals(task1(arg),expected);
        Assert.assertNotEquals(task1(arg), first);
    }

    @Test
    public void testTask2(){
        int arg = 128;
        int expected = 1;
        int first = 56;
        Assert.assertEquals(task2(arg),expected);
        Assert.assertNotEquals(task2(arg),first);
    }

    @Test
    public void testTask3(){
        int expected = 143;
        int first = 256;
       Assert.assertEquals(task3(11),expected);
       Assert.assertNotEquals(task3(11),first);
    }

}
