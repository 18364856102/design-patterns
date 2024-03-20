package com.qunar.design.creatation.builder;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：抽象建造者
 * @version: 1.0
 */
public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder customScreen(String screen);

    abstract AbstractBuilder customCPU(String cpu);

    abstract AbstractBuilder customMemory(String memory);

    public Phone getProduct() {
        return phone;
    }
}
