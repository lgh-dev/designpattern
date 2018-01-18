package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory colorFactory=FactoryProducer.getFactory(ColorFactory.class);
        AbstractFactory shapeFactory=FactoryProducer.getFactory(ShapeFactory.class);
        Color red=colorFactory.getColor(Red.class);
        red.fill();

        Shape circle=shapeFactory.getShape(Circle.class);
        circle.draw();


    }
}
