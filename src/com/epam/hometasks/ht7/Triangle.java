package com.epam.hometasks.ht7;


public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\na=" + a + "\nb=" + b + "\nc=" + c + "\n\n";
    }

    @Override
    double calcArea() {
        double p = perimetr();
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    private double perimetr() {
        return (a+b+c)/2;
    }
}
