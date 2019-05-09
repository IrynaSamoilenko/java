package com.epam.lessons.les13;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
//        staff.addPerson(new Employee("Iryna", 23, "dev", 1000.0));
//        staff.addPerson(new Employee("Iryna", 44, "QA", 3500.0));
//        staff.addPerson(new Employee("Oleg", 30, "DevOps", 1000.0));
//        InputOutputFileManager.writeFile(staff.getPeople())
        staff.addPerson(InputOutputFileManager.readFile());
        staff.viewPeople();
    }
}
