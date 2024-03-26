package com.qunar.design.structural.proxy.dynamic;

import java.util.Arrays;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/25
 * @description ：动态代理模式
 * 代理对象和目标对象的相同点在于都实现了相同的接口
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 1) 创建被代理对象
        ManTikTok manTikTok = new XueTikTok();

        /**
         * 动态代理机制，JDK要求动态代理对象必须有接口
         */
        // 2) 得到代理对象
        ManTikTok proxy = JDKTikTokProxy.getProxy(manTikTok);
        // 3) 使用被代理对象，调用方法
        proxy.tiktok();

        ((SellTikTok) proxy).sell();

        // 能不能代理被代理对象自己的方法
        //((XueTikTok) proxy).test();
        System.out.println(proxy.getClass());
        System.out.println(Arrays.toString(proxy.getClass().getInterfaces()));
    }
}
