package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 21:49
 * @description:
 **/
public class StringArrayIterator implements Iterator {

    String[] args;

    Integer index=0;

    public StringArrayIterator(String[] args) {
        this.args = args;
    }

    @Override
    public Boolean hasNext() {
        if(index<args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return args[index++];
        }
        return null;
    }
}
