package com.github.curriculeon;

public class Student extends Person implements Learner{

    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
        totalStudyTime = 0.0;
    }

    @Override
    public void learn(Double numberOfHours) {
        if(numberOfHours > 0){
            this.totalStudyTime += numberOfHours;
        }
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
