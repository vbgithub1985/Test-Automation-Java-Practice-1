package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        if (sideA<=0 || sideB<=0) throw new IllegalArgumentException();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        if (sideA<=0) throw new IllegalArgumentException();
        this.sideA = sideA;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area(){
        return sideA * sideB;
    }

    public double perimeter(){
       return (sideA + sideB) * 2;
    }

    public boolean isSquare(){
        return sideA == sideB;
    }

    public void replaceSides(){
        double tempside = sideA;
        sideA = sideB;
        sideB = tempside;
    }
}
