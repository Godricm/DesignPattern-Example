package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 14:04
 * @description:
 **/
public class CompositeEntity {
    private CoarseGrainedObject cgo=new CoarseGrainedObject();

    public void setData(String data1,String data2){
        cgo.setData(data1,data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
