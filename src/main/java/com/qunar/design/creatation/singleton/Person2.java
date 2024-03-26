package com.qunar.design.creatation.singleton;

/**
 * 单例模式：
 * 某个类只能有一个实例；（构造器私有）
 * 它必须自行创建这个实例；（自己编写实例化逻辑）
 * 它必须自行向整个系统提供这个实例；（对外提供实例化方法）
 */
public class Person2 {
    // 懒汉
    private static Person2 instance;
    private String name;
    private Integer age;
    // 饿汉
    //private static final Person instance = new Person();

    // 构造器私有
    private Person2() {

    }

    // 提供给外部的方法
    public static Person2 getInstance() {
        synchronized (Person2.class) {
            // 如果没有再创建
            if (instance == null) {
                Person2 person = new Person2();
                instance = person;
            }
        }
        return instance;
    }
}

