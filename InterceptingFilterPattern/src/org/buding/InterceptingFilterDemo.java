package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:11
 * @description:
 **/
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager=new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client=new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Home");
    }
}
