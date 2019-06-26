package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:53
 * @description:
 **/
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(Integer level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: "+message);
    }
}
