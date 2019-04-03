package com.epam.hometasks.ht7;


public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\nradius=" + radius+ "\n\n";
    }

    @Override
    double calcArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
}
