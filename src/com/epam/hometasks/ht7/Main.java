package com.epam.hometasks.ht7;
import com.epam.hometasks.ht7.View.View;
import com.epam.hometasks.ht7.Model.Circle;
import com.epam.hometasks.ht7.Model.Rectangle;
import com.epam.hometasks.ht7.Model.Shape;
import com.epam.hometasks.ht7.Model.Triangle;

import java.util.Arrays;


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

//        System.out.println("TOTAL AREA=" + ShapeCalculator.calcTotalArea(shapes));
//        System.out.println("Circle area = " + ShapeCalculator.calcCirclesArea(shapes));
//        System.out.println("Triangle area = " + ShapeCalculator.calcTriangleArea(shapes));
//        System.out.println("Rectangle area = " + ShapeCalculator.calcRectaangleArea(shapes));
        Arrays.sort(shapes, new ColorComparator());

        for (Shape shape: shapes) {
            System.out.println(shape);
        }



    }




}
