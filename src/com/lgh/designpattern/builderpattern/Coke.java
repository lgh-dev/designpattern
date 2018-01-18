package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 13.0f;
    }
}
