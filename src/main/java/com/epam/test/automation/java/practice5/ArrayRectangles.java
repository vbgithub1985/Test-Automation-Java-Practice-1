package com.epam.test.automation.java.practice5;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangleArray) {
        this.rectangleArray = rectangleArray;
    }

    public boolean addRectangle(Rectangle rectangle){
        boolean result = false;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null){
                result = true;
                rectangleArray[i] = rectangle;
                break;
            }
        }
        return result;
    }

    public int numberMaxArea(){
        int resultIndex = 0;
        float maxArea = rectangleArray[0].area();
        for (int i = 1; i < rectangleArray.length; i++) {
            float area = rectangleArray[i].area();
            if (area>maxArea){
                maxArea = area;
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    public int numberMinPerimeter(){
        int resultIndex = 0;
        float min = rectangleArray[0].perimeter();
        for (int i = 1; i < rectangleArray.length; i++) {
            float perimetr = rectangleArray[i].perimeter();
            if (perimetr<min){
                min = perimetr;
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    public int numberSquares(){
        int result = 0;
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i].isSquare()) result++;
        }
        return result;
    }
}
