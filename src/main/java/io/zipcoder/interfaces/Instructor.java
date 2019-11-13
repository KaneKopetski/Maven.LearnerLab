package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor() {
        super();
    }

    public Instructor(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }

}
