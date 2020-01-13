package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestClassroom {

    public void TestHostLecture(Teacher teacher, Long teacherId, Double... hours){
        //given
        Classroom CLASSROOM = Classroom.getINSTANCE();
        Double expectedHours = 0D;
        //When
        if(teacher != null && Instructors.getINSTANCE().contains((Instructor) teacher)){
            for(Double hr : hours){
                if(hr>0){
                    expectedHours += hr/Students.getINSTANCE().count();
                }
                CLASSROOM.hostLecture(teacher,hr);
            }
        }

        if(teacherId != null && Instructors.getINSTANCE().findById(teacherId) != null){
            for(Double hr : hours){
                if(hr>0){
                    expectedHours += hr/Students.getINSTANCE().count();
                }
                CLASSROOM.hostLecture(teacherId,hr);
            }
        }

        Double[] learnedHours = CLASSROOM.getStudyMap().toArray(new Double[0]);
        for(Double x : learnedHours){
            System.out.println(x);
        }
        //Then
        System.out.println("Expected Hours "+expectedHours);
        for(Double actualHoursPerStudent : learnedHours){
            Assert.assertEquals(expectedHours, actualHoursPerStudent);
        }
    }


    public void initialize(){
        Instructor i1 = new Instructor((long) 1,"i1");
        Instructor i2 = new Instructor((long) 2,"i2");
        Instructor i3 = new Instructor((long) 3,"i3");
    }

    @Test
    public void classRoomTest1(){
        Instructor i1 = new Instructor((long) 1,"i1");
        TestHostLecture(i1,null,10D,-5D,10D);
    }

    @Test
    public void classRoomTest2(){
        Instructor i1 = new Instructor((long) 1,"i1");
        TestHostLecture(i1,2L,10D,-5D,10D);
    }
}
