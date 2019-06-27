package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 09:49
 * @description:
 **/
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
    }
}
