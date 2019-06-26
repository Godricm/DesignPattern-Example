package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:20
 * @description:纸包装
 **/
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
