package org.buding;

import java.util.HashMap;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 15:51
 * @description:
 **/
public class ShapeFactory {

    private static final HashMap<String,Shape> circleMap=new HashMap<>();

    public static Shape getCircle(String color){

        Circle circle=(Circle) circleMap.get(color);
        if(circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : "+color);
        }

        return circle;
    }
}
