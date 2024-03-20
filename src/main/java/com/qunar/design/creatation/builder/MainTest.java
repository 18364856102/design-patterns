package com.qunar.design.creatation.builder;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：屏蔽过程而不屏蔽细节
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        // 定制建造了小米手机
        XiaoMiPhoneBuilder xiaoMiPhoneBuilder = new XiaoMiPhoneBuilder();
        xiaoMiPhoneBuilder.customCPU("骁龙888");
        xiaoMiPhoneBuilder.customScreen("防蓝光");
        xiaoMiPhoneBuilder.customMemory("2T");
        Phone phone = xiaoMiPhoneBuilder.getProduct();

        // 链式调用，如Swagger
        System.out.println(phone);
        XiaoMiPhoneBuilder builder = new XiaoMiPhoneBuilder();
        Phone product = builder.customCPU("骁龙865").customScreen("防蓝光").customMemory("2T").getProduct();
        System.out.println(product);

        Phone phone2 = Phone.builder().screen("骁龙950").memory("520G").build();
        System.out.println(phone2);
    }
}
