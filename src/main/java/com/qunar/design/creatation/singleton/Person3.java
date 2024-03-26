package com.qunar.design.creatation.singleton;

/**
 * 单例模式：
 * 某个类只能有一个实例；（构造器私有）
 * 它必须自行创建这个实例；（自己编写实例化逻辑）
 * 它必须自行向整个系统提供这个实例；（对外提供实例化方法）
 */
public class Person3 {
    // 懒汉
    private volatile static Person3 instance;
    private String name;
    private Integer age;
    // 饿汉
    //private static final Person instance = new Person();

    // 构造器私有
    private Person3() {

    }

    // 提供给外部的方法
    public static Person3 getInstance() {
        // 双重检查锁+内存可见性（指令重排问题）
        if (instance == null) {
            synchronized (Person3.class) {
                if (instance == null) {
                    Person3 person = new Person3();
                    instance = person;
                }
            }

        }
        return instance;
    }
}

