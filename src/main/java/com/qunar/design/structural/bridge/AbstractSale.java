package com.qunar.design.structural.bridge;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/22
 * @description ：2、渠道抽象
 * @version: 1.0
 */
public abstract class AbstractSale {
    private String type;
    private String price;

    public AbstractSale(String type, String price) {
        this.type = type;
        this.price = price;
    }

    String getSaleInfo() {
        return "type: " + type + ", price: " + price;
    }
}
