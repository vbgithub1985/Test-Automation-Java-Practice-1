package com.epam.test.automation.java.practice1;

import org.junit.Assert;
import org.junit.Test;

import static com.epam.test.automation.java.practice1.Main.task1;


public class MainTest {

    @Test

    public void testTask1(){
        Assert.assertEquals(0, task1(0));
        Assert.assertEquals(5, task1(-5));
        Assert.assertEquals(16, task1(4));
        Assert.assertNotEquals(16,task1(5));
    }


}