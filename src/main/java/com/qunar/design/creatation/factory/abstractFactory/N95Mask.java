package com.qunar.design.creatation.factory.abstractFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：具体产品
 * @version: 1.0
 */
public class N95Mask extends AbstractMask {

    public N95Mask() {
        this.price = 2;
    }

    @Override
    public void protectMe() {
        System.out.println("超级防护");
    }
}
