package com.lgh.designpattern.singletonpattern;

/**
 * @version V1.0
 * @class_name : SingleObject
 * @package : com.lgh.designpattern.singletonpattern
 * @describe : TODO 单例模式 懒汉式 线程不安全
 * @creat_user : liangguohui
 * @creat_email: 18520640132@163.com
 * @creat_date : 2018/1/16/016
 * @creat_time : 6:46
 **/

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    /**
     * 线程不安全
     * @return
     */
    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
    return instance;
    }

    /**
     * 线程安全,但效率低
     * @return
     */
    public static synchronized Singleton getInstance2(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
