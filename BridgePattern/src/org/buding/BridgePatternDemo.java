package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:24
 * @description:
 **/
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle=new Circle(100,100,10,new RedCircle());
        Shape greenCircle=new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
