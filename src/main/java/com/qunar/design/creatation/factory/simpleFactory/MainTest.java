package com.qunar.design.creatation.factory.simpleFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        WuLingCarFactory wuLingCarFactory = new WuLingCarFactory();
        AbstractCar mini = wuLingCarFactory.newCar("mini");
        mini.run();
        AbstractCar van = wuLingCarFactory.newCar("van");
        van.run();
    }
}
