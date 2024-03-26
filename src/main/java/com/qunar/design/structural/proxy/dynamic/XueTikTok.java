package com.qunar.design.structural.proxy.dynamic;


/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：Subject 主体
 * @version: 1.0
 */
public class XueTikTok implements ManTikTok, SellTikTok {
    @Override
    public void tiktok() {
        System.out.println("薛薛薛。。。tiktok");
    }

    @Override
    public void sell() {
        System.out.println("666 大甩卖");
    }

    public void test() {
        System.out.println("自己的方法");
    }
}
