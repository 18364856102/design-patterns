package com.qunar.design.structural.adapter;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class Zh2JpTranslator implements Translator {
    @Override
    public String translate(String content) {
        return "日语版：\n" + content;
    }
}
