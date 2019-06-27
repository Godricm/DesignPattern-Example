package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 11:01
 * @description:
 **/
public class OperationMultiply implements Strategy {
    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1 * num2;
    }
}
