package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
