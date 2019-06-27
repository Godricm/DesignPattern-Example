package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:06
 * @description:
 **/
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client=new Client();
        client.setData("Test","Data");
        client.printData();
        client.setData("Second Test","Data1");
        client.printData();
    }
}
