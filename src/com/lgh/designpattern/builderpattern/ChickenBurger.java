package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 23.0f;
    }
}
