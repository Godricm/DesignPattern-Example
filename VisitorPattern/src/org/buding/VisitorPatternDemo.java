package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:11
 * @description:
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart=new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
