package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 17:30
 * @description:
 **/
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //工厂创建
        PcFactory pcFactory1=FactoryProducer.getFactory("DELL");
        //具体执行
        pcFactory1.createMouse().sayHi();
        pcFactory1.createKeyBo().sayHi();

        PcFactory pcFactory2=FactoryProducer.getFactory("HP");
        pcFactory2.createMouse().sayHi();
        pcFactory2.createKeyBo().sayHi();
    }
}
