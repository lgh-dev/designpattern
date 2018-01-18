package com.lgh.designpattern.factorypattern.modify;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class ShapeFactory implements AbstractFactory {

    @Override
    public Object getObj(Class<?> shape) {
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
