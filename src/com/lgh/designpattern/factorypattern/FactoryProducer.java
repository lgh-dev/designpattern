package com.lgh.designpattern.factorypattern;

/**
 * Created by Administrator on 2018/1/15/015.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(Class<? extends AbstractFactory> abstractFactory){

        AbstractFactory obj=null;
        try {
            obj= (AbstractFactory) Class.forName(abstractFactory.getName()).newInstance();
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
