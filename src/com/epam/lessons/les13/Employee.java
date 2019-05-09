package com.epam.lessons.les13;

import java.io.Serializable;

public class Employee extends Person {
    private String position;
    private double salary;
    private static int nextID = 1;
    private int id;

    public Employee(String name, int age, String position, double salary) {
        super(name, age);
        this.position = position;
        this.salary = salary;
        this.id= nextID++;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return "Employee: " + super.toString() +
                "position='" + position + '\'' +
                ", salary=" + salary;
    }


}
