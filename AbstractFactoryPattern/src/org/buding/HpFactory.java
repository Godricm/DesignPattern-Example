package org.buding;

/**
 * @program: DesignPattern-Example
 * @author: miaochen
 * @create: 2019-06-25 17:26
 * @description:
 **/
public class HpFactory extends PcFactory {
    @Override
   public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBo createKeyBo() {
        return new HpKeyBo();
    }
}
