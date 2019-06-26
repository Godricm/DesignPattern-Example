package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 13:20
 * @description:
 **/
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(Integer radius, Integer x, Integer y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
