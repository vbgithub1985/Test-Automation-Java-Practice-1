package com.epam.test.automation.java.practice5;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6,6);
        Rectangle rectangle2 = new Rectangle(55);
        Rectangle rectangle3 = new Rectangle(0);
        Rectangle rectangle4 = new Rectangle(5);
        Rectangle rectangle5 = new Rectangle(66);

        ArrayRectangles arrayRectangles = new ArrayRectangles(rectangle1,rectangle2,rectangle3,rectangle4,rectangle5);
        /*arrayRectangles.addRectangle(rectangle1);
        arrayRectangles.addRectangle(rectangle2);
        arrayRectangles.addRectangle(rectangle3);
        arrayRectangles.addRectangle(rectangle4);
        arrayRectangles.addRectangle(rectangle5);*/

        System.out.println(arrayRectangles.numberMaxArea());
        System.out.println(arrayRectangles.numberMinPerimeter());
        System.out.println(arrayRectangles.numberSquares());

        /*float area1 = rectangle1.area();
        float area2 = rectangle2.area();
        float area3 = rectangle3.area();
        float area4 = rectangle4.area();

        float perimetr1 = rectangle1.perimeter();
        float perimetr2 = rectangle2.perimeter();
        float perimetr3 = rectangle3.perimeter();
        float perimetr4 = rectangle4.perimeter();

        boolean square1 = rectangle1.isSquare();
        boolean square2 = rectangle2.isSquare();
        boolean square3 = rectangle3.isSquare();
        boolean square4 = rectangle4.isSquare();

        System.out.println(String.format("SideA = %f, SideB = %f. Area of 1 rectangle = %f, Perimetr of 1 rectangle = %f, Issquare = %b",rectangle1.getSideA(),rectangle1.getSideB(), area1, perimetr1, square1));
        System.out.println(String.format("SideA = %f, SideB = %f. Area of 2 rectangle = %f, Perimetr of 2 rectangle = %f, Issquare = %b",rectangle2.getSideA(),rectangle2.getSideB(), area2, perimetr2, square2));
        System.out.println(String.format("SideA = %f, SideB = %f. Area of 3 rectangle = %f, Perimetr of 3 rectangle = %f, Issquare = %b",rectangle3.getSideA(),rectangle3.getSideB(), area3, perimetr3, square3));
        System.out.println(String.format("SideA = %f, SideB = %f. Area of 4 rectangle = %f, Perimetr of 4 rectangle = %f, Issquare = %b",rectangle4.getSideA(),rectangle4.getSideB(), area4, perimetr4, square4));

        rectangle1.replaceSides();
        System.out.println(String.format("SideA = %f, SideB = %f. Area of 1 rectangle = %f, Perimetr of 1 rectangle = %f, Issquare = %b",rectangle1.getSideA(),rectangle1.getSideB(), rectangle1.area(), rectangle1.perimeter(), square1));
*/
    }



}
