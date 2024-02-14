package com.qunar.design.creatation.singleton;

/**
 * 单例模式：
 * 某个类只能有一个实例；（构造器私有）
 * 它必须自行创建这个实例；（自己编写实例化逻辑）
 * 它必须自行向整个系统提供这个实例；（对外提供实例化方法）
 */
public class Person {
    private String name;

    private Integer age;

    // 懒汉
    private static Person instance;
    // 饿汉
    //private static final Person instance = new Person();

    // 构造器私有
    private Person() {

    }

    // 提供给外部的方法
    public static synchronized Person getInstance() {
        // 如果没有再创建
        if (instance == null) {
            Person person = new Person();
            instance = person;
        }
        return instance;
    }
}

