package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 10:34
 * @description:
 **/
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name=name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
