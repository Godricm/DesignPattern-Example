package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 17:44
 * @description:请求类
 **/
public class Stock {

    private String name="ABC";
    private Integer quantity=10;

    public void buy(){
        System.out.println("Stock [ Name : "+name+", Quantity: "+quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name : "+name+", Quantity: "+quantity +" ] sold");
    }
}
