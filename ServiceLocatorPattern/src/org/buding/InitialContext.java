package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:24
 * @description:
 **/
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("Service1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("Service2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
