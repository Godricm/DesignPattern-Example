package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 15:18
 * @description:
 **/
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
