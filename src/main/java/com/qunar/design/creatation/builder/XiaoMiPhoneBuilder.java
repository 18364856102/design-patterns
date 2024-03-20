package com.qunar.design.creatation.builder;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class XiaoMiPhoneBuilder extends AbstractBuilder {
    public XiaoMiPhoneBuilder() {
        //phone = new Phone();
        phone = Phone.builder().build();
    }

    @Override
    XiaoMiPhoneBuilder customScreen(String screen) {
        phone.screen = screen;
        return this;
    }

    @Override
    XiaoMiPhoneBuilder customCPU(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    XiaoMiPhoneBuilder customMemory(String memory) {
        phone.memory = memory;
        return this;
    }
}
