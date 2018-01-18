package com.lgh.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class GenderFilter implements PersonFilter {

    private String gender;

    public GenderFilter(String gender) {
        this.gender = gender;
    }

    @Override
    public List<Person> filter(List<Person> personList) {

        List<Person> people=new ArrayList<>();
        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase(gender)){
                people.add(person);
            }
        }
        return people;
    }
}
