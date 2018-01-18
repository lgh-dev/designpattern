package com.lgh.designpattern.singletonpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject singleObject=SingleObject.getInstance();

        singleObject.showMessage();


        Singleton4 singleton4=Singleton4.INSTANCE;

        singleton4.whateverMethod();

    }
}
