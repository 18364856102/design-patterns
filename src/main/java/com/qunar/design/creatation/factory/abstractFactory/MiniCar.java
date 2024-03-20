package com.qunar.design.creatation.factory.abstractFactory;


/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：
 * @version: 1.0
 */
public class MiniCar extends AbstractCar {
    public MiniCar() {
        this.engine = "mini";
    }

    @Override
    public void run() {
        System.out.println("哒哒哒");
    }
}
