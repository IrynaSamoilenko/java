package com.epam.hometasks.ht7.Model;


import com.epam.hometasks.ht7.Model.Shape;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\ncolor=" + this.getColor() +
                "\nheight=" + height + "\nwidth=" + width+ "\n\n";
    }

    @Override
    public double calcArea() {
        double area = height*width;
        return area;
    }


}
