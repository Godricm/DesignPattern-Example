package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 17:50
 * @description:
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock=new Stock();

        BuyStock buyStockOrder=new BuyStock(abcStock);
        SellStock sellStockOrder=new SellStock(abcStock);

        Broker broker=new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
