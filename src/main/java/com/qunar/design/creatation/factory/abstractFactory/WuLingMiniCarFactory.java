package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;
import com.qunar.design.creatation.factory.factoryMethod.MiniCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class WuLingMiniCarFactory extends WuLingCarFactory {
    @Override
    AbstractCar newCar() {
        return new MiniCar();
    }
}
