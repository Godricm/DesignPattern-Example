package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 09:50
 * @description:
 **/
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject=subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
    }
}
