package com.qunar.design.creatation.factory.simpleFactory;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/19
 * @description ：简单工厂：产品数量极少
 * @version: 1.0
 */
public class WuLingCarFactory {
    /**
     * @param type Class：好像具有扩展性，但是没有解决实际问题
     * @return
     */
    public AbstractCar newCar(String type) {
        // 核心方法：一切从简
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }

        //。。。

        // 更多的产品，违反开闭原则。应该直接扩展出一个类来造
        return null;
    }
}
