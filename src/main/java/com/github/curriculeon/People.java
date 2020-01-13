package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<somePerson extends Person> implements Iterable<somePerson>{
    List<somePerson> personList;

    public People(List<somePerson> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(somePerson person){
        personList.add(person);
    }

    public somePerson findById(long id){
        for(somePerson p : personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(somePerson person){
        return personList.contains(person);
    }

    public void remove(long id){
//        for(Person p: personList){
//            if(p.getId() == id){
//                personList.remove(p);
//            }
//        }

        for(Iterator<somePerson> iterator = this.iterator(); iterator.hasNext();){
            somePerson p = iterator.next();
            if(p.getId() == id){
                iterator.remove();
                return;
            }
        }
    }

    public void remove(somePerson person){
        personList.remove(person);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    abstract public somePerson[] toArray();

    @Override
    public Iterator<somePerson> iterator() {
        return personList.iterator();
    }
}
