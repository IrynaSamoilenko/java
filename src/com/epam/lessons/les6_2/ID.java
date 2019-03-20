package com.epam.lessons.les6_2;

public class ID {
    private int id;
    private static int nextId = (int)(Math.random()*100);

    public ID () {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
