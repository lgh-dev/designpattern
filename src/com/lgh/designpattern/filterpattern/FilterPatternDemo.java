package com.lgh.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @class_name : FilterPatternDemo
 * @package : com.lgh.designpattern.filterpattern
 * @describe : TODO 过滤器模式
 * @creat_user : liangguohui
 * @creat_email: 18520640132@163.com
 * @creat_date : 2018/1/17/017
 * @creat_time : 7:56
 **/

public class FilterPatternDemo {

    public static void main(String[] args) {

        List<Person> people=new ArrayList<>();
        people.add(new Person("1","xxx","男"));
        people.add(new Person("2","xxx2","男"));
        people.add(new Person("3","xxx","女"));
        people.add(new Person("4","xxx","男"));
        people.add(new Person("5","xxx","男"));

        people=new AndFilter(new IdFilter("1"),new NameFilter("xxx")).filter(people);

        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
