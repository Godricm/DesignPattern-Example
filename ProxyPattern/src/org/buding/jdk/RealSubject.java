package org.buding.jdk;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:20
 * @description:
 **/
public class RealSubject implements Subject {
    @Override
    public Integer sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
