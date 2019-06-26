package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:22
 * @description:
 **/
public class Circle extends Shape {
    private Integer x,y,radius;

    public Circle(Integer x,Integer y,Integer radius, DrawApi drawApi) {
        super(drawApi);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
