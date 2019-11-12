package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    Person person;
    String expectedName = "Kane";
    Long expectedId = 15L;

    @Before
    public void testSetup() {

        Person person = new Person(expectedId, expectedName);
        this.person = person;
    }

    @Test
    public void constructorTest() {
        String actualName = person.getName();
        Long actualId = person.getId();

        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest() {
        String expectedName = "New";
        person.setName(expectedName);

        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);

    }

}
