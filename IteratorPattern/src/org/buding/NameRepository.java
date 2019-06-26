package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 21:36
 * @description: Container实体类
 **/
public class NameRepository implements Container {
    public  String[] names={"Robert","John","Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{

        Integer index=0;

        @Override
        public Boolean hasNext() {
            if(index<names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
