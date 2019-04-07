package com.epam.hometasks.ht7;

import com.epam.hometasks.ht7.Model.Shape;

public class ShapeCalculator {

    static double calcTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape element : shapes) {
            totalArea += element.calcArea();
        }
        return totalArea;
    }

    static double calcCirclesArea(Shape[] shapes) {
        double circleArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            String actualClass = shapes[i].getClass().getName();
            if (actualClass.contains("Circle")) {
                circleArea += shapes[i].calcArea();
            }
        }
        return circleArea;
    }

    static double calcTriangleArea(Shape[] shapes) {
        double triangleArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            String actualClass = shapes[i].getClass().getName();
            if (actualClass.contains("Triangle")) {
                triangleArea += shapes[i].calcArea();
            }
        }
        return triangleArea;
    }

    static double calcRectaangleArea(Shape[] shapes) {
        double rectangleArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            String actualClass = shapes[i].getClass().getName();
            if (actualClass.contains("Rectangle")) {
                rectangleArea += shapes[i].calcArea();
            }
        }
        return rectangleArea;
    }
}
