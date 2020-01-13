package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    @Test
    public void TestImplementation() {
        //Given
        Person instructor = new Instructor((long) 1, "instructor");

        //When
        boolean instanceOfTeacher = instructor instanceof Teacher;

        //Then
        Assert.assertTrue(instanceOfTeacher);
    }

    @Test
    public void TestInheritence() {
        //Given
        Instructor instructor = new Instructor((long) 1, "instructor");

        //When
        boolean instanceofPerson = instructor instanceof Person;

        //Then
        Assert.assertTrue(instanceofPerson);
    }

    public void TestTeach(Double... numberOfHours){
        // given
        Instructor instructor = new Instructor((long) 1, "instructor");
        Student student = new Student((long) 1, "student");

        Double expectedHours = 0.0;
        for(Double hr : numberOfHours){
            if(hr>0){
                expectedHours += hr;
            }
        }

        //when
        for(Double hr : numberOfHours) {
            instructor.teach(student, hr);
        }

        // then
        Double actualHours = student.getTotalStudyTime();
        Assert.assertEquals(expectedHours,actualHours);
    }

    @Test
    public void TestTeach1(){
        TestTeach(10.0,20.0,30.0);
    }

    @Test
    public void TestTeach2(){
        TestTeach(0.0,20.0,30.0);
    }

    @Test
    public void TestTeach3(){
        TestTeach(10.0,20.0,-30.0);
    }

    public void TestLecture(Double... numberOfHours){
        //given
        Instructor instructor = new Instructor((long) 1, "instructor");
        Student student1 = new Student((long) 1, "student");
        Student student2 = new Student((long) 1, "student");
        Student student3 = new Student((long) 1, "student");
        Student student4 = new Student((long) 1, "student");
        Student[] students = new Student[]{student1,student2,student3,student4};

        Double expectedHours = 0.0;
        for(Double hr : numberOfHours){
            if(hr>0){
                expectedHours += hr/students.length;
            }
        }

        // when
        for(Double hr : numberOfHours){
            instructor.lecture(students,hr);
        }

        // then
        for(Student s : students){
            Double actualHours = s.getTotalStudyTime();
            Assert.assertEquals(expectedHours,actualHours);
        }
    }

    @Test
    public void TestLecture1(){
        TestLecture(10.0,20.0,30.0);
    }

    @Test
    public void TestLecture2(){
        TestLecture(-10.0,20.0,30.0);
    }

    @Test
    public void TestLecture3(){
        TestLecture(0.0,20.0,30.0);
    }



}
