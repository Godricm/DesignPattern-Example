package org.buding;

import org.buding.jdk.MyInvocationHandler;
import org.buding.jdk.RealSubject;
import org.buding.jdk.Subject;
import java.lang.reflect.Proxy;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:18
 * @description:
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加
        // 图像不需要从磁盘加

        Subject realSubject=new RealSubject();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(realSubject);

        Subject proxyClass=(Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Subject.class},myInvocationHandler);
        proxyClass.sellBooks();
        proxyClass.speak();
    }
}
