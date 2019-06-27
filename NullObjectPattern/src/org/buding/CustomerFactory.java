package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 10:36
 * @description:
 **/
public class CustomerFactory {

    public static final String[] names={"Rob","Joe","Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
