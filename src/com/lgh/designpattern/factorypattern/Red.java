package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("创建Red");
    }
}
