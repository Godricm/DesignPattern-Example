package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:46
 * @description:
 **/
public abstract class AbstractLogger {
    public static Integer INFO=1;
    public static Integer DEBUG=2;
    public static Integer ERROR=3;

    protected Integer level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger=nextLogger;
    }

    public  void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
