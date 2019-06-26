package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 10:14
 * @description:
 **/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        //统一注册
        ShapeCache.loadCache();

        Shape rectangle=ShapeCache.getShape("1");
        System.out.println("Shape:"+rectangle.getType());

        Shape square=ShapeCache.getShape("2");
        System.out.println("Shape:"+square.getType());

        Shape circle=ShapeCache.getShape("3");
        System.out.println("Shape:"+circle.getType());
    }
}
