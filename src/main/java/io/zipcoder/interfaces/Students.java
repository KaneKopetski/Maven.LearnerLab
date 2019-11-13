package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students() {
    }

    public static Students getInstance() {
        INSTANCE.add(new Student(1L, "Rashmi"));
        INSTANCE.add(new Student(2L, "Val"));
        INSTANCE.add(new Student(3L, "Ben"));
        INSTANCE.add(new Student(4L, "Usha"));
        return INSTANCE;
    }

}
