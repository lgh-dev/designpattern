package com.lgh.designpattern.builderpattern;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder=new MealBuilder();
        Meal meal1= mealBuilder.PrepareNonVegMeal();
        Meal meal2= mealBuilder.prepareVegMeal();
        System.out.println("VegMeal");
        System.out.println(meal1.getCost());
        meal1.showItems();
        System.out.println("NonVegMeal");
        System.out.println(meal2.getCost());
        meal2.showItems();

    }
}
