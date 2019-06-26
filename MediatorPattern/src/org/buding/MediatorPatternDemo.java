package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 22:19
 * @description:
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert=new User("Robert");
        User john=new User("John");

        robert.sendMessage("Hi| John!");
        john.sendMessage("Hello! Robert!");
    }
}
