package com.qunar.design.structural.adapter;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/21
 * @description ：
 * @version: 1.0
 */
public class MoviePlayer implements Player {
    @Override
    public String play() {
        StringBuilder builder = new StringBuilder();
        builder.append("愿我魏无羡能够一生锄奸扶弱，无愧于心。\n");
        builder.append("蓝湛，你还记不记得当初我们一起许下的诺言？许我一生锄奸扶弱，而如今你告诉我，孰强孰弱，又熟黑熟白，这难道就是你我誓死守护的诺言？");
        String content = builder.toString();
        return content;
    }
}
