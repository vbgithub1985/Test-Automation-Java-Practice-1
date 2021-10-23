package com.epam.test.automation.java.practice1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.test.automation.java.practice1.Main.task1;


public class MainTest {

    @Test
    public void testTask1(){
        Assert.assertEquals(task1(0),0 );
        Assert.assertEquals(task1(-5),5);
        Assert.assertEquals(task1(4),16);
        Assert.assertNotEquals(task1(5),16);
    }


}