package com.qunar.switchAndIfElse.test;

import com.qunar.switchAndIfElse.WeekDay;

import static com.qunar.switchAndIfElse.WeekDay.MON;
import static com.qunar.switchAndIfElse.WeekDay.SAT;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/10
 * @description ：
 * @version: 1.0
 */
public class TestEnum {
    public static void main(String[] args) {
        testSwitch(MON);
        testSwitch(SAT);
    }

    public static void testSwitch(WeekDay w) {
        switch (w) {
            case MON, TUE, WED, THU, FRI:
                System.out.println("工作日");
                break;
            case SAT, SUN:
                System.out.println("休息日");
                break;
        }
    }
}
