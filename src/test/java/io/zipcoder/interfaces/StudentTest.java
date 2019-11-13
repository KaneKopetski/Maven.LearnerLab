package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setupTest() {
        Student student = new Student();
        this.student = student;
    }

    @Test
    public void testLearn() {
        Double expectedStudyTime = 15D;
        student.learn(expectedStudyTime);

        Double actualStudyTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedStudyTime, actualStudyTime);

    }

    @Test
    public void subclassPersonTest() {
        Assert.assertTrue(student instanceof Person);

    }

    @Test
    public void implementsLearnerTest() {
        Assert.assertTrue(student instanceof Learner);

    }
}