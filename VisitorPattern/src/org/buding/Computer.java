package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:04
 * @description:
 **/
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts=new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for (int i=0;i<parts.length;i++){
            parts[i].accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }
}
