package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:22
 * @description:
 **/
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
