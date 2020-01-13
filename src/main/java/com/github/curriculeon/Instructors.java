package com.github.curriculeon;

public class Instructors extends People<Instructor>{
    final static Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor i1 = new Instructor((long) 1,"i1");
        super.add(i1);
        Instructor i2 = new Instructor((long) 2,"i2");
        super.add(i2);
        Instructor i3 = new Instructor((long) 3,"i3");
        super.add(i3);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return super.personList.toArray( new Instructor[0] );
    }
}
