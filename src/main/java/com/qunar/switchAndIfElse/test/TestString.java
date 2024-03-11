package com.qunar.switchAndIfElse.test;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/10
 * @description ：
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        testSwitch("1");
    }

    public static void testSwitch(String s) {
        switch (s) {
            case "1", "2", "3", "4", "5":
                System.out.println("工作日");
                break;
            case "6", "7":
                System.out.println("休息日");
                break;
            default:
                System.out.println("日期非法");
        }
    }
}
