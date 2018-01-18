package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public abstract class Burger implements Item{



    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
