package io.zipcoder.interfaces;

    public class Student extends Person implements Learner {
    private Double totalStudyTime = 0D;

    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

}
