package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:26
 * @description: 饮料食物
 **/
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return null;
    }

    @Override
    public abstract float price();
}
