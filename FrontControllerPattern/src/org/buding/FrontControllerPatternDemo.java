package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:49
 * @description:
 **/
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController=new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
