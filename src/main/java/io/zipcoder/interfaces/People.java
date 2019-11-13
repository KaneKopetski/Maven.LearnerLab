package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }

    public Boolean add(Person person) {
        return this.personList.add(person);
    }

    public Person findById(Long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        } return null;
    }

    public Boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    public Iterator iterator() {
        return personList.iterator();
    }

    public Integer size() {
        return personList.size();
    }
}
