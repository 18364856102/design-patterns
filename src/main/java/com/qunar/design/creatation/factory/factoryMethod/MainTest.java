package com.qunar.design.creatation.factory.factoryMethod;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingMiniCarFactory wuLingMiniCarFactory = new WuLingMiniCarFactory();
        MiniCar miniCar = (MiniCar) wuLingMiniCarFactory.newCar();
        miniCar.run();

        WuLingVanCarFactory wuLingVanCarFactory = new WuLingVanCarFactory();
        AbstractCar vanCar = wuLingVanCarFactory.newCar();
        vanCar.run();

        WuLingRacingCarFactory wuLingRacingCarFactory = new WuLingRacingCarFactory();
        AbstractCar racingCar = wuLingRacingCarFactory.newCar();
        racingCar.run();
    }
}
