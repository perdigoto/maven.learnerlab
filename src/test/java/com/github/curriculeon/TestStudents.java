package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void TestStudentsExist(){
        //given
        Students STUDENTS = Students.getINSTANCE();

        Student s1 = new Student((long) 1, "s1");
        Student s2 = new Student((long) 2, "s2");
        Student s3 = new Student((long) 3, "s3");
        Student s4 = new Student((long) 4, "s4");
        Student s5 = new Student((long) 5, "s5");

        //When
        boolean contains1 = STUDENTS.contains(s1);
        boolean contains2 = STUDENTS.contains(s2);
        boolean contains3 = STUDENTS.contains(s3);
        boolean contains4 = STUDENTS.contains(s4);
        boolean contains5 = STUDENTS.contains(s5);

        //Then
        Assert.assertTrue(contains1);
        Assert.assertTrue(contains2);
        Assert.assertTrue(contains3);
        Assert.assertTrue(contains4);
        Assert.assertTrue(contains5);
    }


}
