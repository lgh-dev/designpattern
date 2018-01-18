package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class ColorFactory implements AbstractFactory{
    @Override
    public Shape getShape(Class<? extends Shape> shape) {
        return null;
    }

    @Override
    public Color getColor(Class<? extends Color> color) {
        Color obj=null;
        try {
            obj= (Color) Class.forName(color.getName()).newInstance();
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
