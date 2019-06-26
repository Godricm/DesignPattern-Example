package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 20:38
 * @description:
 **/
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();
        object.showMessage();
    }
}
