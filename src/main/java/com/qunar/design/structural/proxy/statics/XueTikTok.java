package com.qunar.design.structural.proxy.statics;

import com.qunar.design.structural.decorator.ManTikTok;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：Subject 主体
 * @version: 1.0
 */
public class XueTikTok implements ManTikTok {
    @Override
    public void tiktok() {
        System.out.println("薛薛薛。。。tiktok");
    }
}
