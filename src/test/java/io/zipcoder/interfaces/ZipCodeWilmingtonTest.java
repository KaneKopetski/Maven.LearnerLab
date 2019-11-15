package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        Student student = Students.getInstance().toArray()[0];
        ZipCodeWilmington.getInstance().hostLecture(1L, 20D);

        Double expected = 40D;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hostLecture1Test() {
        Instructors instructors = Instructors.getInstance();
        Instructor instructor = instructors.findById(1L);
        Student student = Students.getInstance().toArray()[0];
        ZipCodeWilmington.getInstance().hostLecture(instructor, 20D);

        Double expected = 20D;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}