package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 15:48
 * @description:
 **/
public class Circle implements Shape {
    private String color;
    private Integer x;
    private Integer y;
    private Integer radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle:Draw() [Color : "+color
                +" , x : "+x
                +" , y :"+y
                +" , radius : "+radius);
    }
}
