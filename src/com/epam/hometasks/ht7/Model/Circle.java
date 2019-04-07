package com.epam.hometasks.ht7.Model;


import com.epam.hometasks.ht7.Model.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\ncolor=" + this.getColor() +
                "\nradius=" + radius+ "\n\n";
    }

    @Override
    public double calcArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
}
