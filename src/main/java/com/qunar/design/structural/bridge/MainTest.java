package com.qunar.design.structural.bridge;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：
 * 省去了创建很多类
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setSale(new OnlineAbstractSale("线上", "9999"));

        System.out.println(iPhone.getSale().getSaleInfo());
        System.out.println(iPhone.getPhone());
    }
}
