package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 20:25
 * @description:表达式接口
 **/
public interface Expression {
    public Boolean interpret(String context);
}
