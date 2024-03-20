package com.qunar.design.structural.adapter;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：适配器
 * 1.类结构型适配器
 * @version: 1.0
 */
public class JPMovieAdapter extends Zh2JpTranslator implements Player {

    /**
     * 被适配对象
     */
    private Player player;

    public JPMovieAdapter(Player player) {
        this.player = player;
    }

    @Override
    public String play() {
        return translate(player.play());
    }
}
