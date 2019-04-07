package com.epam.hometasks.ht7.Model;


public class Shape implements Comparable <Shape>{
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "Color = " + color+ "\n\n";
    }

    public double calcArea() {
        return 0;
    }

    @Override
    public int compareTo(Shape anyShape) {
        return color.compareTo(anyShape.color);
    }

}

