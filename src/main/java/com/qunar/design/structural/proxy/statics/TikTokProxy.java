package com.qunar.design.structural.proxy.statics;

import com.qunar.design.structural.decorator.ManTikTok;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/25
 * @description ：代理一般都和被代理对象实现相同的接口
 * @version: 1.0
 */
public class TikTokProxy implements ManTikTok {

    /**
     * 被代理对象
     */
    private ManTikTok manTikTok;

    public TikTokProxy(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        // 增强功能
        System.out.println("渲染直播间");
        System.out.println("北京分部 薛薛薛 正在直播哦~");
        manTikTok.tiktok();
    }
}
