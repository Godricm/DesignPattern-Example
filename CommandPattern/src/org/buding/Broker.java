package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 17:48
 * @description:
 **/
public class Broker {

    private List<Order> orderList=new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order :orderList){
            order.execute();
        }
        orderList.clear();
    }
}
