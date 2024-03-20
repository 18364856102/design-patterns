package com.qunar.design.creatation.factory.abstractFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：工厂产品
 * 怎么把一个功能提升到一个层次？定义抽象（抽象类、接口）
 * 抽象类、接口 就会有多实现，多实现自然有多功能
 * @version: 1.0
 */
public abstract class AbstractCar {
    String engine;

    public abstract void run();
}
