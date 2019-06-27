package org.buding;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 09:45
 * @description:
 **/
public class Subject {
    private List<Observer> observers=new ArrayList<>();

    public int getState() {
        return state;
    }

    private int state;

    public void setState(int state){
        this.state=state;
        notifityAllObserver();
    }

    public void attch(Observer observer){
        observers.add(observer);
    }


    public void  notifityAllObserver(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
