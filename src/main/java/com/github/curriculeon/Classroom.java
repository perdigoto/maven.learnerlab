package com.github.curriculeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    final static Classroom INSTANCE = new Classroom();
    final private Students STUDENTS = Students.getINSTANCE();
    final private Instructors INSTRUCTORS = Instructors.getINSTANCE();

    private Classroom() {
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        if (INSTRUCTORS.contains((Instructor)teacher)){
            teacher.lecture(STUDENTS.toArray(), numberOfHours);
        }
    }

    public void hostLecture(long id, Double numberOfHours) {
        Teacher instructor = INSTRUCTORS.findById(id);
        System.out.println(instructor);
        if(instructor != null){
            instructor.lecture(STUDENTS.toArray(), numberOfHours);
        }
    }

    public List<Double> getStudyMap() {
        List<Double> studyHours = new ArrayList<>();
        for (Student student : STUDENTS.toArray()) {
            studyHours.add(student.getTotalStudyTime());
        }
        return studyHours;
    }

    public static Classroom getINSTANCE() {
        return INSTANCE;
    }
}
