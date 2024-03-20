package com.qunar.design.creatation.factory.abstractFactory;


/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：
 * @version: 1.0
 */
public class RacingCar extends AbstractCar {
    public RacingCar() {
        this.engine = "v8";
    }

    @Override
    public void run() {
        System.out.println("嗖~");
    }
}
