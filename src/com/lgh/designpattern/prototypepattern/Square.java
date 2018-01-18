package com.lgh.designpattern.prototypepattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class Square extends Shape {

    public Square() {
        type="Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }


}
