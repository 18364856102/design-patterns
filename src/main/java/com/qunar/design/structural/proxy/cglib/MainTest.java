package com.qunar.design.structural.proxy.cglib;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/27
 * @description ：Cglib动态代理
 * 对指定的目标类生成一个子类，并覆盖其中方法实现增强
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        XueTikTok xueTikTok = new XueTikTok();
        XueTikTok proxy = CglibProxy.createProxy(xueTikTok);
        proxy.tiktokHaha();
    }
}
