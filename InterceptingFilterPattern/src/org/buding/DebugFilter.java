package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 15:04
 * @description:
 **/
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: "+request);
    }
}
