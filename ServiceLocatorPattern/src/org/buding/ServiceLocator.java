package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:28
 * @description:服务定位器
 **/
public class ServiceLocator {
    private static Cache cache;
    static {
        cache=new Cache();
    }

    public static Service getService(String jndiName){
        Service service=cache.getServices(jndiName);
        if(service!=null){
            return  service;
        }

        InitialContext context=new InitialContext();
        Service service1=(Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
