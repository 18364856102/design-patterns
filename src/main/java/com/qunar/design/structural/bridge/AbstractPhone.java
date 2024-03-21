package com.qunar.design.structural.bridge;

import lombok.Data;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：1、抽象手机类
 * 手机有很多销售渠道，其价格都不同
 * @version: 1.0
 */
@Data
public abstract class AbstractPhone {

    /**
     * 分离渠道，桥接的关注点
     * 桥接在此。。。设计期间就要想好
     * 真正会引起此类维度变化的一个维度，直接抽取出来。通过组合的方式接起来
     */
    AbstractSale sale;
    // abstract int getPrice(); // 如果这么写需要多个实现，违反开闭原则。

    /**
     * 当前手机的描述
     *
     * @return
     */
    abstract String getPhone();
}
