package com.epam.test.automation.java.practice5;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {
    Rectangle recWithoutPar = new Rectangle();
    Rectangle recWithParA = new Rectangle(2.4);
    Rectangle recWithPar = new Rectangle(8, 8);

    @Test
    public void isTrue() {
        assertTrue(true);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgument_1() {
        Rectangle x = new Rectangle(0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgument_2() {
        Rectangle x = new Rectangle(4, -1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testIllegalArgument_3() {
        Rectangle x = new Rectangle(-0.1, 0);
    }

    @Test
    public void testArea() {
        assertEquals(recWithParA.area(), 12);
    }

    @Test
    public void testPerimeter() {
        assertEquals(recWithoutPar.perimeter(), 14);
    }

    @Test
    public void testIsSquareTrue() {
        assertTrue(recWithPar.isSquare());
    }

    @Test
    public void testIsSquareFalse() {
        assertFalse(recWithParA.isSquare());
    }

    @org.testng.annotations.Test
    public void testReplaceSides() {
        recWithoutPar.replaceSides();
        assertEquals(recWithoutPar.getSideA(), 3);
        assertEquals(recWithoutPar.getSideB(), 4);
    }
}
