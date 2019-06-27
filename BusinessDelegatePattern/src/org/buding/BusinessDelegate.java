package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 13:47
 * @description: 业务代表
 **/
public class BusinessDelegate {
    private BusinessLookUp businessLookUp=new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;
    public void setServiceType(String serviceType){
        this.serviceType=serviceType;
    }

    public void doTask(){
        businessService=businessLookUp.getBusinessService(this.serviceType);
        businessService.doProcessing();
    }
}
