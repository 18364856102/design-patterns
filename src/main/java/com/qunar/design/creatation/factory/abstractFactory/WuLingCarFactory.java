package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：汽车集团
 * @version: 1.0
 */
public abstract class WuLingCarFactory extends WuLingFactory {
    abstract AbstractCar newCar();

    @Override
    AbstractMask newMask() {
        return null;
    }
}
