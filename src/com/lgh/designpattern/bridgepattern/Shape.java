package com.lgh.designpattern.bridgepattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class Shape {

    private DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public void draw() {
        drawAPI.drawCricle();
    }

}
