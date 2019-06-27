package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:07
 * @description:
 **/
public class ComputerPartDisplayVisitor implements ComputerVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display monitor");
    }
}
