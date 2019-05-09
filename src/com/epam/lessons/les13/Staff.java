package com.epam.lessons.les13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

public class Staff {
    private List<Person> people= new ArrayList<>();

    public void addPerson(Person person){ people.add(person); }

    public void addPerson(List<Person> personList){ people.addAll(personList); }

    public List<Person> getPeople() { return people; }

    public boolean deletePerson(int id) {
        Iterator <Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if (employee.getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void viewPeople() {
        if (people.isEmpty()){
            System.out.println("List is empty!");
        }
        for(Person p : people){
            System.out.println(p);
        }
    }


}
