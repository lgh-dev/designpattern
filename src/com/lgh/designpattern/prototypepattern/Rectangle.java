package com.lgh.designpattern.prototypepattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class Rectangle extends Shape{

    public Rectangle(){type="rectangle";}

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");

    }
}
