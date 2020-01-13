package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
         List<Person> l = new ArrayList<>();
        Person p1 = new Person((long) 1,"a");
        Person p2 = new Person((long) 2,"b");

        l.add(p1);
        l.add(p2);
        l.add(p1);


        l.remove(p1);

        System.out.println(p1);
        System.out.println(l);
    }






}
