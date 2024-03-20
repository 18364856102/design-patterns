package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：口罩集团
 * @version: 1.0
 */
public abstract class WuLingMaskFactory extends WuLingFactory {
    @Override
    AbstractCar newCar() {
        return null;
    }

    abstract AbstractMask newMask();
}
