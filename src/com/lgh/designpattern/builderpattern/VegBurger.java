package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
