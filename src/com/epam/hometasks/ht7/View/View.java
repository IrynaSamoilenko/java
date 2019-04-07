package com.epam.hometasks.ht7.View;

import com.epam.hometasks.ht7.Model.Shape;

public class View {

    static void printArray(Shape[] shapes) {
        for (Shape element : shapes) {
            System.out.println(element.toString());

        }
    }
}
