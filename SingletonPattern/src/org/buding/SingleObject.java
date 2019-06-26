package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 20:35
 * @description: 单例
 **/
public class SingleObject {

    private static SingleObject instance=new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
