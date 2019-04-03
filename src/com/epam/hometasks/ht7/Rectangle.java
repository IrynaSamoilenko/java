package com.epam.hometasks.ht7;


public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\nheight=" + height + "\nwidth=" + width+ "\n\n";
    }

    @Override
    double calcArea() {
        double area = height*width;
        return area;
    }


}
