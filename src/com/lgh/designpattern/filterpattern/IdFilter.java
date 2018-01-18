package com.lgh.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class IdFilter implements PersonFilter{

    private String id;

    public IdFilter(String id) {
        this.id = id;
    }

    @Override
    public List<Person> filter(List<Person> personList) {

        List<Person> people=new ArrayList<>();
        for (Person person : personList) {
            if(person.getId().equalsIgnoreCase(id)){
                people.add(person);
            }
        }

        return people;
    }
}
