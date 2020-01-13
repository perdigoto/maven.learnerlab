package com.github.curriculeon;

public enum Educator implements Teacher{
    I1(1L,"i1"),
    I2(2L,"i2"),
    I3(3L,"i3");

    final Instructor instructor;
    private double hoursWorked;

    Educator(Long id, String name) {
        this.instructor = new Instructor(id, name) {

            @Override
            public void teach(Learner learner, Double numberOfHours) {
                instructor.teach(learner, numberOfHours);
                Educator.this.hoursWorked+=numberOfHours;
            }
        };
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
    }
}
