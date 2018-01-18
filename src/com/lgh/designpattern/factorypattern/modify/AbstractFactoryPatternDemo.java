package com.lgh.designpattern.factorypattern.modify;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory colorFactory= FactoryProducer.getFactory(ColorFactory.class);
        AbstractFactory shapeFactory= FactoryProducer.getFactory(ShapeFactory.class);
        Color red= (Color) colorFactory.getObj(Red.class);
        red.fill();

        Shape circle= (Shape) shapeFactory.getObj(Circle.class);
        circle.draw();


    }
}
