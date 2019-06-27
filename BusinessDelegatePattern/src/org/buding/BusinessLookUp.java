package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:46
 * @description: 查找服务
 **/
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return  new EJBService();
        }else {
            return new JMSService();
        }
    }
}
