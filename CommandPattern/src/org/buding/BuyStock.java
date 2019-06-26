package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 17:47
 * @description: Order接口的实现类
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
