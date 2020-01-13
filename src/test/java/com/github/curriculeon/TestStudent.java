package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void TestImplementation() {
        //Given
        Person student = new Student((long) 1, "student");

        //When
        boolean instanceOfLearner = student instanceof Learner;

        //Then
        Assert.assertTrue(instanceOfLearner);
    }

    @Test
    public void TestInheritence() {
        //Given
        Person student = new Student((long) 1, "student");

        //When
        boolean instanceOfPerson = student instanceof Person;

        //Then
        Assert.assertTrue(instanceOfPerson);
    }

    public void TestLearn( Double expectedTime, Double... timeLearning) {
        //Given
        Student student = new Student((long) 1, "student");
        /*
        Double expectedTime = 0.0;
        for (Double i : timeLearning) {
            if (i > 0) {
                expectedTime += i;
            }
        }
         */

        //When
        for (Double i : timeLearning) {
            student.learn(i);
        }
        Double actualTime = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expectedTime, actualTime);
    }

    @Test
    public void TestLearn1() {
        TestLearn(20.0,20.0);
    }

    @Test
    public void TestLearn2() {
        TestLearn(24.2,21.0, 2.0, 1.2);
    }

    @Test
    public void TestLearn3() {
        TestLearn(25.2,20.2, -2.0, 5.0);
    }

    @Test
    public void TestLearn4() {
        TestLearn(21.0,20.0, -5.0, 1.0);
    }

    @Test
    public void TestLearn5() {
        TestLearn(29.0,20.0, 3.0, 6.0);
    }


}
