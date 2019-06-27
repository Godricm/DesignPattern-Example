package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:07
 * @description:
 **/
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain=new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void  filterRequest(String request){
        filterChain.execute(request);
    }

}
