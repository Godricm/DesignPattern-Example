package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:01
 * @description: 元素的接口
 **/
public interface ComputerPart {
    void accept(ComputerVisitor computerVisitor);
}
