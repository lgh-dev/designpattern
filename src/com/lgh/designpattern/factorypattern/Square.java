package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("创建Square");
    }
}
