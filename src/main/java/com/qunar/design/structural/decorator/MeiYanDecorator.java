package com.qunar.design.structural.decorator;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：美颜装饰器
 * 装饰谁？
 * 装饰器只关心增强的类的方法
 * @version: 1.0
 */
public class MeiYanDecorator implements TikTokDecorator {
    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        // 开启美颜
        enable();

        // 适配器模式
        // framework.enable();

        // 开始直播
        manTikTok.tiktok();
    }

    @Override
    public void enable() {
        System.out.println("开启美颜~");
        System.out.println("开启滤镜~");
        System.out.println("开启瘦脸");
        System.out.println("开启大眼~");
    }
}
