package com.epam.test.automation.java.practice5;

public class Rectangle {
    private float sideA;
    private float sideB;

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(float sideA) {
        this.sideA = sideA;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = -3;
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float area(){
        float result = sideA * sideB;
        return result;
    }

    public float perimeter(){
        float result = (sideA + sideB) * 2;
        return result;
    }

    public boolean isSquare(){
        return sideA == sideB;
    }

    public void replaceSides(){
        float tempside = sideA;
        sideA = sideB;
        sideB = tempside;
    }
}
