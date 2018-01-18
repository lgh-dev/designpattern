package com.lgh.designpattern.factorypattern.modify;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class ColorFactory implements AbstractFactory {

    @Override
    public Color getObj(Class<? extends Object> color) {
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
