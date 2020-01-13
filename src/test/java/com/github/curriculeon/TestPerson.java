package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    public void TestConstructor(long id, String name){
        // given
        Person person = new Person(id,name);
        long expectedId = id;
        String expectedName = name;

        //when
        long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void TestConstructor1(){
        TestConstructor(1,"kevin");
    }

    @Test
    public void TestConstructor2(){
        TestConstructor(2,"someone");
    }

    public void TestSetName(String nameInput){
        //given
        Person person = new Person((long)1,"kevin");
        String expected = nameInput;

        //when
        person.setName(nameInput);
        String actual = person.getName();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TestSetName1(){
        TestSetName("b");
    }

    @Test
    public void TestSetName2(){
        TestSetName("noone");
    }


}
