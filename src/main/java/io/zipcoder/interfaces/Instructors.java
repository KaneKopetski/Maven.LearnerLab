package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor froilan = new Instructor(1L, "Froilan");
        personList.add(froilan);
//        personList.add(new Instructor(2L, "Roberto"));
//        personList.add(new Instructor(3L, "Chris"));
//        personList.add(new Instructor(4L, "Dolio"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }

}
