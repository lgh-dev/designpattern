package com.lgh.designpattern.abstractactorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("创建Rectangle");
    }
}
