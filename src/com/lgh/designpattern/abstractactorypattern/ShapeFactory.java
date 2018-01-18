package com.lgh.designpattern.abstractactorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class ShapeFactory {

    public static Shape getClass(Class<? extends Shape> shape){
        Shape obj=null;
        try {
            obj= (Shape) Class.forName(shape.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
