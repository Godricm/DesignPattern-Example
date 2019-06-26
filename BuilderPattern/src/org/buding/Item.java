package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 22:18
 * @description:y一个表示食物条目和食物包装的接口
 **/
public interface Item {

    String name();

    Packing packing();

    float price();

}
