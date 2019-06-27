package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 10:35
 * @description:
 **/
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
