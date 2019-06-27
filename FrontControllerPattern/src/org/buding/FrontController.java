package org.buding;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:40
 * @description:
 **/
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher=new Dispatcher();
    }

    private Boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: "+request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
