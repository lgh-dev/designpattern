package com.lgh.designpattern.factorypattern.modify;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("创建blue");
    }
}
