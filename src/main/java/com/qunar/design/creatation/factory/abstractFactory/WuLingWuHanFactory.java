package com.qunar.design.creatation.factory.abstractFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class WuLingWuHanFactory extends WuLingMaskFactory {

    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
