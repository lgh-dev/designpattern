package com.lgh.designpattern.filterpattern;

import java.util.List;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class AndFilter implements PersonFilter{

    private PersonFilter thefilter;
    private PersonFilter othersFilter;

    public AndFilter(PersonFilter thefilter, PersonFilter othersFilter) {
        this.thefilter = thefilter;
        this.othersFilter = othersFilter;
    }


    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> people=thefilter.filter(personList);
        return othersFilter.filter(people);
    }
}
