package com.epam.hometasks.ht7;
import com.epam.hometasks.ht6.model.SourceData;
import com.epam.hometasks.ht7.Shape;
import com.epam.hometasks.ht7.Triangle;
import sun.jvm.hotspot.memory.Space;


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Triangle("red", 5, 8, 11);
        shapes[1] = new Triangle("black", 10, 6, 7);
        shapes[2] = new Circle("white", 5);
        shapes[3] = new Circle("white", 10);
        shapes[4] = new Circle("green", 3);
        shapes[5] = new Rectangle("yellow", 7, 2);
        shapes[6] = new Rectangle("yellow", 8, 4);
        shapes[7] = new Rectangle("yellow", 9, 6);
        shapes[8] = new Rectangle("yellow", 10, 8);

        System.out.println("TOTAL AREA=" + calcTotalArea(shapes));
        System.out.println("Circle area = " + calcCirclesArea(shapes));
        System.out.println("Triangle area = " + calcTriangleArea(shapes));
        System.out.println("Rectangle area = " + calcRectaangleArea(shapes));
        printArray(shapes);

    }

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


    static void printArray(Shape[] shapes) {
        for (Shape element : shapes) {
            String info = element.toString();
            double area = element.calcArea();
            System.out.println(info+"area=" + area+ "\n------------------------");

        }
    }
}
