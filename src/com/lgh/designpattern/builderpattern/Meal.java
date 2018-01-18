package com.lgh.designpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class Meal {

    private List<Item> items=new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float f=0.0f;
        for (Item item : items) {
            f+=item.price();
        }
        return f;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("Item"+item.name());
            System.out.println("Packing"+item.packing());
            System.out.println("price"+item.price());
        }
    }


}
