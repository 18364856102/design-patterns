package com.qunar.design.creatation.factory.factoryMethod;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：
 * @version: 1.0
 */
public class VanCar extends AbstractCar {
    public VanCar() {
        this.engine = "van";
    }

    @Override
    public void run() {
        System.out.println("嘟嘟嘟");
    }
}
