package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Instructor instructor;
    Student student1;
    Student student2;
    Student student3;
    Learner[] learners;


    @Before
    public void setup() {
        Instructor instructor = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        this.instructor = instructor;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;

        this.learners = new Learner[]{student1, student2, student3};

    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Double expectedNumberOfHours = 10D;
        instructor.teach(student1, expectedNumberOfHours);

        Double actualNumberOfHours = student1.getTotalStudyTime();

        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours);
    }

    @Test
    public void testLecture() {
        Double lectureTime = 10D;
        Double expectedNumberOfHours = lectureTime/learners.length;
        instructor.lecture(learners, lectureTime);
        Double actualNumberOfHours = student2.getTotalStudyTime();

        Assert.assertEquals(expectedNumberOfHours, actualNumberOfHours);
    }
}