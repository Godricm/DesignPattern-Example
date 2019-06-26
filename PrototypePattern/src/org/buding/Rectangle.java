package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 10:07
 * @description:
 **/
public class Rectangle extends Shape {
    public Rectangle() {
        type="Rectangle";
    }


    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
