package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:23
 * @description:
 **/
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
