package com.qunar.design.structural.decorator;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：抖音直播抽象装饰器
 * @version: 1.0
 */
public interface TikTokDecorator extends ManTikTok {
    /**
     * 装饰器定义的额外的增强功能~
     */
    void enable();
}
