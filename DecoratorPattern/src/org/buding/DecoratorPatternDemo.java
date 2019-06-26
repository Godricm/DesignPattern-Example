package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 15:00
 * @description:
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle=new Circle();
        ShapeDecorator redCircle=new RedShapDecorator(new Circle());
        ShapeDecorator redRectangle=new RedShapDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n Circle of red border");
        redCircle.draw();

        System.out.println("\n Rectangle of red border");
        redRectangle.draw();
    }
}
