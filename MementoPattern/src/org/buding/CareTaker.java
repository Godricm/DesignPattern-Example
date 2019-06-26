package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 23:08
 * @description:
 **/
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(Integer index){
        return mementoList.get(index);
    }
}
