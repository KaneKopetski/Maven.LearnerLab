package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        Student student = new Student(1L, "Rashmi");
        personList.add(student);
//        personList.add(new Student(1L, "Rashmi"));
//        personList.add(new Student(2L, "Val"));
//        personList.add(new Student(3L, "Ben"));
//        personList.add(new Student(4L, "Usha"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }

}
