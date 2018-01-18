package com.lgh.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class NameFilter implements PersonFilter {

    private String name;

    public NameFilter(String name) {
        this.name = name;
    }

    @Override
    public List<Person> filter(List<Person> personList) {

        List<Person> people=new ArrayList<>();
        for (Person person : personList) {
            if(person.getName().equalsIgnoreCase(name)){
                people.add(person);
            }
        }
        return people;
    }
}
