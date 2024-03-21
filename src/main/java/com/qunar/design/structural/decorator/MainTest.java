package com.qunar.design.structural.decorator;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        XueTikTok xueTikTok = new XueTikTok();
        //xueTikTok.tiktok();

        MeiYanDecorator meiYanDecorator = new MeiYanDecorator(xueTikTok);
        meiYanDecorator.tiktok();
    }
}
