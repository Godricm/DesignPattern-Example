package org.buding.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 16:21
 * @description:
 **/
public class MyInvocationHandler implements InvocationHandler {
    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     因为需要处理真实角色，所以要把真实角色传进来
     */
    Subject realSubject;

    /**
     *
     * @param 代理类
     * @param 正在调用的方法
     * @param 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if(method.getName().equals("sellBooks")){
            int invoke=(int)method.invoke(realSubject,args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        }else{
            String string=(String) method.invoke(realSubject,args);
            System.out.println("调用的是说话的方法");
            return string;
        }
    }
}
