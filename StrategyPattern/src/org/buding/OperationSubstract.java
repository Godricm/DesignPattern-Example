package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 11:00
 * @description:
 **/
public class OperationSubstract implements Strategy {
    @Override
    public Integer doOperation(Integer num1, Integer num2) {
        return num1-num2;
    }
}
