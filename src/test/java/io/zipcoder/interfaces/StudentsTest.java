package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testStudents() {
        Students students = Students.getInstance();
        Integer expected = 4;
        Integer actual = students.size();

        Assert.assertEquals(expected, actual);
    }

}