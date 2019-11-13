package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Instructors instructors = Instructors.getInstance();
        Integer expected = 4;
        Integer actual = instructors.size();

        Assert.assertEquals(expected, actual);
    }
}