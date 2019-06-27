package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 11:19
 * @description:
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();

        System.out.println();

        game=new Football();
        game.play();
    }
}
