package com.lgh.designpattern.filterpattern;

import java.util.List;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public interface PersonFilter {

    List<Person> filter(List<Person> personList);

}
