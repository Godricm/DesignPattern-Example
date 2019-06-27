package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:02
 * @description:
 **/
public class CoarseGrainedObject {
    DependentObject1 do1=new DependentObject1();
    DependentObject2 do2=new DependentObject2();

    public void setData(String datat1,String data2){
        do1.setData(datat1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
