package com.qunar.design.creatation.factory.factoryMethod;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：RacingCar分厂
 * @version: 1.0
 */
public class WuLingRacingCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
