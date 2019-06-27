package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 09:52
 * @description:
 **/
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject=subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
