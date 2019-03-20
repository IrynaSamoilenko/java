package com.epam.lessons.les6_1;

/**
 * Created by Samoilenko Iryna
 * from 14/03/2019
 */

public class Lesson6_1 {
    public static void main(String[] args) {
//        Animals animals = new Animals();
//        animals.printAnimals();
//
//        animals.setAge(7);
//        animals.setName("Cat");
//        animals.setSpeed(5);
//        animals.printAnimals();
//
//        Animals animals1 = new Animals("Dog", 3, 11);
//        animals1.printAnimals();
        Animals[] animals = {
                new Animals("Cat", 14, 10),
                new Animals("Dog", 10, 10),
                new Animals("Bird", 1, 10),
                new Animals("Elephant", 55, 10)
        };
        for (Animals elem: animals) {
            elem.printAnimals();
        }
        System.out.println("----------------------------------------");
        for (Animals a: animals) {
            if (a.getAge() > 5) {
                a.printAnimals();
            }
        }


    }
}
