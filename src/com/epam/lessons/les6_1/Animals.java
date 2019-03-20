package com.epam.lessons.les6_1;

/**
 * Created by Samoilenko Iryna
 * from 14/03/2019
 */

public class Animals {
    private String name;
    private int age;
    private int speed;

    public Animals() { }

    public Animals(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public void printAnimals() {
        System.out.println("Name = " + name +
                "; " + "Age = " + age +
                "; " + "Speed = " + speed);
    }
}
