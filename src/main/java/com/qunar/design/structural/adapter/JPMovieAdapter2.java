package com.qunar.design.structural.adapter;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：适配器
 * 2.对象结构型适配器
 * @version: 1.0
 */
public class JPMovieAdapter2 implements Player {
    /**
     * 适配者(转换接口)
     */
    private static final Translator translator = new Zh2JpTranslator();
    /**
     * 被适配对象
     */
    private Player player;


    public JPMovieAdapter2(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        // 字母转换
        return translator.translate(player.play());
    }
}
