package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 17:48
 * @description:
 **/
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
