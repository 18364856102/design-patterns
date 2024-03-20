package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;
import com.qunar.design.creatation.factory.factoryMethod.RacingCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class WuLingRacingCarFactory extends WuLingCarFactory {
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

}
