package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void TestInstructorsExist(){
        //Given
        Instructors INSTRUCTORS = Instructors.getINSTANCE();
        Instructor i1 = new Instructor((long) 1,"i1");
        Instructor i2 = new Instructor((long) 2,"i2");
        Instructor i3 = new Instructor((long) 3,"i3");

        //When
        boolean containi1 = INSTRUCTORS.contains(i1);
        boolean containi2 = INSTRUCTORS.contains(i2);
        boolean containi3 = INSTRUCTORS.contains(i3);

        //Then
        Assert.assertTrue(containi1);
        Assert.assertTrue(containi2);
        Assert.assertTrue(containi3);
    }
}
