package com.lgh.designpattern.prototypepattern;

import java.util.Hashtable;

/**
 * @version V1.0
 * @class_name : PrototypePatternDemo
 * @package : com.lgh.designpattern.prototypepattern
 * @describe : TODO 原型模式
 * @creat_user : liangguohui
 * @creat_email: 18520640132@163.com
 * @creat_date : 2018/1/17/017
 * @creat_time : 7:00
 **/

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Hashtable<String,Shape> shapeHashtable=new Hashtable<>();

        shapeHashtable.put("1",new Cricle());
        shapeHashtable.put("2",new Rectangle());
        shapeHashtable.put("3",new Square());


        Shape cricle= (Shape) shapeHashtable.get("1").clone();
        Shape rectangle= (Shape) shapeHashtable.get("2").clone();
        Shape square= (Shape) shapeHashtable.get("3").clone();

        cricle.draw();
        rectangle.draw();
        square.draw();


    }
}
