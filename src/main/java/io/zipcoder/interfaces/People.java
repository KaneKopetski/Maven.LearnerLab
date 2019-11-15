package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable {
    List<E> personList = new ArrayList();

    public Boolean add(E person) {
        return this.personList.add(person);
    }

    public E findById(Long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        } return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public Boolean remove(E person) {
        return personList.remove(person);
    }

    public Boolean remove(Long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return personList.remove(person);
            }
        }
        return false;
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public abstract E[] toArray();
    //return personList.toArray(new E[0]);

    public Iterator iterator() {
        return personList.iterator();
    }

    public Integer size() {
        return personList.size();
    }
}
