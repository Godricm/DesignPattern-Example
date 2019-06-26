package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:55
 * @description:
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(Integer level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: "+message);
    }
}
