package com.lgh.designpattern.singletonpattern;

/**
 * @version V1.0
 * @class_name : SingleObject
 * @package : com.lgh.designpattern.singletonpattern
 * @describe : TODO 单例模式 饿汉式
 * @creat_user : liangguohui
 * @creat_email: 18520640132@163.com
 * @creat_date : 2018/1/16/016
 * @creat_time : 6:46
 **/

public class SingleObject {

    private static SingleObject instance=new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
