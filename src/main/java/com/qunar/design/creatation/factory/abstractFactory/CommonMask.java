package com.qunar.design.creatation.factory.abstractFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：具体产品
 * @version: 1.0
 */
public class CommonMask extends AbstractMask {

    public CommonMask() {
        this.price = 1;
    }

    @Override
    public void protectMe() {
        System.out.println("简单保护，请及时更换");
    }
}
