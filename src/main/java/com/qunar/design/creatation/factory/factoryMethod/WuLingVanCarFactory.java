package com.qunar.design.creatation.factory.factoryMethod;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：VanCar分厂
 * @version: 1.0
 */
public class WuLingVanCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
