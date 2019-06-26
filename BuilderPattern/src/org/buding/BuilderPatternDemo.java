package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:51
 * @description:
 **/
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();

        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost："+vegMeal.getCost());

        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost:"+nonVegMeal.getCost());
    }
}
