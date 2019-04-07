package com.epam.hometasks.ht7.Model;


import com.epam.hometasks.ht7.Model.Shape;

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

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "\ncolor=" + this.getColor() +
                "\na=" + a + "\nb=" + b + "\nc=" + c + "\n\n";
    }

    @Override
    public double calcArea() {
        double p = perimetr();
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    private double perimetr() {
        return (a+b+c)/2;
    }
}
