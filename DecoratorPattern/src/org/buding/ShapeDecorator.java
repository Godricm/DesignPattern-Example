package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 14:57
 * @description:
 **/
public abstract class ShapeDecorator implements Shape {

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    protected Shape decoratorShape;

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
