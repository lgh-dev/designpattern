package com.lgh.designpattern.abstractactorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();

       Circle circle= (Circle) shapeFactory.getClass(Circle.class);
       Rectangle rectangle= (Rectangle) shapeFactory.getClass(Rectangle.class);
       Square square= (Square) shapeFactory.getClass(Square.class);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

    }
}
