package com.epam.hometasks.ht7;

import com.epam.hometasks.ht6.model.SourceData;
import sun.jvm.hotspot.memory.Space;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + "Color = " + color+ "\n\n";
    }

    double calcArea() {
        return 0;
    }

}

