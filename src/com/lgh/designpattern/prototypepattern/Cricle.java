package com.lgh.designpattern.prototypepattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class Cricle extends Shape {
    public Cricle() {
        type="Cricle";

    }

    @Override
    void draw() {
        System.out.println("cricle");
    }
}
