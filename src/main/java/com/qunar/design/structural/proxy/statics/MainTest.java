package com.qunar.design.structural.proxy.statics;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/25
 * @description ：
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        TikTokProxy tikTokProxy = new TikTokProxy(new XueTikTok());
        tikTokProxy.tiktok();

        // 静态代理就是装饰器
        // 装饰器模式是代理模式的一种
    }
}
