package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:30
 * @description: 外卖
 **/
public class Meal {
    private List<Item> items=new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost=0.0f;
        for (Item item :items){
            cost+=item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item :items){
            System.out.println("Item:"+item.name()+",Packing:"+item.packing()+", Price："+item.price());
        }
    }

}
