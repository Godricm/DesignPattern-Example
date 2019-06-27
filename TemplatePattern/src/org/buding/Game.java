package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-27 11:16
 * @description:
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
