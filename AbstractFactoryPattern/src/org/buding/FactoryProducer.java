package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 17:28
 * @description:
 **/
public class FactoryProducer {

    public static PcFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("DELL")){
            return  new DellFactory();
        }else if(factory.equalsIgnoreCase("HP")){
            return new HpFactory();
        }

        return null;
    }
}
