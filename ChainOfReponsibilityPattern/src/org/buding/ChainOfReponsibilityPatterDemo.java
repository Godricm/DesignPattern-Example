package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:57
 * @description:
 **/
public class ChainOfReponsibilityPatterDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an information");

        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information");

        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information");
    }
}
