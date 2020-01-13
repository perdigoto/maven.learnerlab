//package com.github.curriculeon;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class TestPeople {
//    public void TestAdd(int expectedSize, Person... persons) {
//        // given
//        People people = new People(new ArrayList<Person>());
//
//        //when
//        for (Person p : persons) {
//            people.add(p);
//        }
//
//        // then
//        for (Person p : persons) {
//            boolean contains = people.contains(p);
//            Assert.assertTrue(contains);
//        }
//
//        int actualSize = people.count();
//        Assert.assertEquals(expectedSize, actualSize);
//    }
//
//    @Test
//    public void TestAdd1() {
//        Person p1 = new Person((long) 1, "a");
//        TestAdd(1, p1);
//    }
//
//    @Test
//    public void TestAdd2() {
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        TestAdd(3, p1, p2, p3);
//    }
//
//    @Test
//    public void TestAdd3() {
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        TestAdd(4, p1, p2, p3, p1);
//    }
//
//    public void TestRemove(Person[] expectedArray, Person[] populatingArray, Person personToRemove) {
//        //given
//        People people = new People(new ArrayList<>(Arrays.asList(populatingArray)));
//        Person[] expected = expectedArray;
//
//        //when
//        people.remove(personToRemove);
//
//        //Then
//        Person[] actual = people.toArray();
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void TestRemove1() {
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3};
//        Person[] expected = new Person[]{p1, p2};
//        TestRemove(expected, toPopulate, p3);
//    }
//
//    @Test
//    public void TestRemove2() {
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p2};
//        Person[] expected = new Person[]{p1, p2, p2};
//        TestRemove(expected, toPopulate, p3);
//    }
//
//    @Test
//    public void TestRemove3() {
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3, p3};
//        Person[] expected = new Person[]{p1, p2, p3};
//        TestRemove(expected, toPopulate, p3);
//    }
//
//    public void TestRemoveById(Person[] expectedArray, Person[] populatingArray, long idToRemove) {
//        //given
//        People people = new People(new ArrayList<>(Arrays.asList(populatingArray)));
//        Person[] expected = expectedArray;
//
//        //when
//        people.remove(idToRemove);
//
//        //Then
//        Person[] actual = people.toArray();
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void TestRemoveById1(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3};
//        Person[] expected = new Person[]{p1, p2};
//        TestRemoveById(expected, toPopulate, 3);
//    }
//
//    @Test
//    public void TestRemoveById2(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person[] toPopulate = new Person[]{p1, p2, p2};
//        Person[] expected = new Person[]{p1, p2, p2};
//        TestRemoveById(expected, toPopulate, 3);
//    }
//
//    @Test
//    public void TestRemoveById3(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3, p3};
//        Person[] expected = new Person[]{p1, p2, p3};
//        TestRemoveById(expected, toPopulate, 3);
//    }
//
//    public void TestRemoveAll(Person[] populatingArray) {
//        //given
//        People people = new People(new ArrayList<>(Arrays.asList(populatingArray)));
//        Person[] expected = new People().toArray();
//
//        //when
//        people.removeAll();
//
//        //Then
//        Person[] actual = people.toArray();
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void TestRemoveAll1(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1};
//        TestRemoveAll(toPopulate);
//    }
//
//    @Test
//    public void TestRemoveAll2(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3, p3};
//        TestRemoveAll(toPopulate);
//    }
//
//    @Test
//    public void TestRemoveAll3(){
//        Person[] toPopulate = new Person[]{};
//        TestRemoveAll(toPopulate);
//    }
//
//    public void TestFindById(Person[] populatingArray, Person expected, long idToFind){
//        // Given
//        People people = new People(new ArrayList<>(Arrays.asList(populatingArray)));
//
//        //When
//        Person actual = people.findById(idToFind);
//
//        //
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void TestFindById1(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3};
//        TestFindById(toPopulate, p1, 1);
//    }
//
//    @Test
//    public void TestFindById2(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3};
//        TestFindById(toPopulate, p2, 2);
//    }
//
//    @Test
//    public void TestFindById3(){
//        Person p1 = new Person((long) 1, "a");
//        Person p2 = new Person((long) 2, "b");
//        Person p3 = new Person((long) 3, "c");
//        Person[] toPopulate = new Person[]{p1, p2, p3};
//        TestFindById(toPopulate, p3, 3);
//    }
//
//}
