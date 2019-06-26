package org.buding;

import java.util.Date;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 22:16
 * @description: 中介者'
 **/
public class ChatRoom {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
