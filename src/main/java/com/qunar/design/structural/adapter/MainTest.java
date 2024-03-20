package com.qunar.design.structural.adapter;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * 系统原来存在的接口都不能动，扩展一个新的类，来连接两个之前的类
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 国人追剧
        MoviePlayer moviePlayer = new MoviePlayer();
        System.out.println(moviePlayer.play());
        System.out.println();

        // 小日子自己找翻译器去追剧，非常麻烦，同声翻译
        Translator translator = new Zh2JpTranslator();
        System.out.println(translator.translate(moviePlayer.play()));
        System.out.println();

        // 为小日子搞一个适配器，使得他使用适配器就可以直接播放日语版的剧
        // 1.类结构型适配器，继承的方式
        JPMovieAdapter jpMovieAdapter = new JPMovieAdapter(moviePlayer);
        System.out.println(jpMovieAdapter.play());
        System.out.println();

        // 2.对象结构型适配器，组合的方式
        JPMovieAdapter2 jpMovieAdapter2 = new JPMovieAdapter2(moviePlayer);
        jpMovieAdapter2.play();
    }
}
