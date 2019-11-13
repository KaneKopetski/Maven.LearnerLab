package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    People peopleList;
    Person person;

    @Before
    public void setup() {
        peopleList = new People();
        person = new Person(1L, "Name");
    }

    @Test
    public void add() {
        Assert.assertTrue(peopleList.add(person));
    }

    @Test
    public void findById() {
        peopleList.add(person);
        Person actual = peopleList.findById(1L);
        Person expected = person;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        peopleList.add(person);
        peopleList.remove(person);

        Integer expected = 0;
        Integer actual = peopleList.size();

        Assert.assertEquals(expected, actual);
    }
}