package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：总厂规范
 * @version: 1.0
 */
public abstract class WuLingFactory {
    abstract AbstractCar newCar();

    abstract AbstractMask newMask();
}
