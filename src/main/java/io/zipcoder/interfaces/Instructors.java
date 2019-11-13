package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
    }

    public static Instructors getInstance() {
        INSTANCE.add(new Instructor(1L, "Froilan"));
        INSTANCE.add(new Instructor(2L, "Roberto"));
        INSTANCE.add(new Instructor(3L, "Chris"));
        INSTANCE.add(new Instructor(4L, "Dolio"));
        return INSTANCE;
    }
}
