package com.lgh.designpattern.singletonpattern;

/**
 * @version V1.0
 * @class_name : Singleton2
 * @package : com.lgh.designpattern.singletonpattern
 * @describe : TODO 单例模式，双重锁，线程安全，效率高。
 * @creat_user : liangguohui
 * @creat_email: 18520640132@163.com
 * @creat_date : 2018/1/16/016
 * @creat_time : 7:02
 **/

public class Singleton2 {

    private volatile static Singleton2 singleton2;

    private Singleton2(){}

    public static Singleton2 getInstance(){

        if(singleton2==null)
            synchronized (Singleton2.class){
            if(singleton2==null)
                singleton2=new Singleton2();

            }

    return singleton2;
    }

}
