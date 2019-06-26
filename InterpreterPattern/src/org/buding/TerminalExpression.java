package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-26 20:29
 * @description:
 **/
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public Boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
