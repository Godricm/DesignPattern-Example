package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:23
 * @description: 瓶装
 **/
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
