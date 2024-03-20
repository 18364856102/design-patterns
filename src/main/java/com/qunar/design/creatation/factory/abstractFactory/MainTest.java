package com.qunar.design.creatation.factory.abstractFactory;

import com.qunar.design.creatation.factory.factoryMethod.AbstractCar;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * 抽象出来
 * 可以抽象为接口(只有方法)
 * 可以抽象为抽象类(有些属性也需要用)
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingMiniCarFactory wuLingMiniCarFactory = new WuLingMiniCarFactory();
        AbstractCar miniCar = wuLingMiniCarFactory.newCar();
        miniCar.run();
        WuLingRacingCarFactory wuLingRacingCarFactory = new WuLingRacingCarFactory();
        AbstractCar racingCar = wuLingRacingCarFactory.newCar();
        racingCar.run();
        WuLingWuHanFactory wuLingWuHanFactory = new WuLingWuHanFactory();
        AbstractMask n95Mask = wuLingWuHanFactory.newMask();
        n95Mask.protectMe();
        WuLingHangZhouMaskFactory wuLingHangZhouMaskFactory = new WuLingHangZhouMaskFactory();
        AbstractMask commonMask = wuLingHangZhouMaskFactory.newMask();
        commonMask.protectMe();
    }
}
