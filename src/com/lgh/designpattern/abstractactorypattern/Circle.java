package com.lgh.designpattern.abstractactorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("创建Circle");
    }
}
