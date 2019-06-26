package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:51
 * @description:
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Integer level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: "+message);
    }
}
