package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 09:45
 * @description: 观察者被
 **/
public abstract class Observer {
    protected Subject subject;

    public  abstract void update();
}
