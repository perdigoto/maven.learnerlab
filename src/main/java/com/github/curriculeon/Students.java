package com.github.curriculeon;

public class Students extends People<Student> {
    final static Students INSTANCE = new Students();

//    private Students(){
//        String[] nameArray = "Kevin Nez Sana".split(" ");
//        for (Long id = 0L; id < nameArray.length; id++) {
//            String name = nameArray[id.intValue()];
//            Student student = new Student(id, name);
//            super.add(student);
//        }
//    }

    private Students() {
        Student s1 = new Student((long) 1, "s1");
        super.add(s1);
        Student s2 = new Student((long) 2, "s2");
        super.add(s2);
        Student s3 = new Student((long) 3, "s3");
        super.add(s3);
        Student s4 = new Student((long) 4, "s4");
        super.add(s4);
        Student s5 = new Student((long) 5, "s5");
        super.add(s5);
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return super.personList.toArray(new Student[0]);
    }
}
