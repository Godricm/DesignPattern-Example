package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:02
 * @description:
 **/
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
