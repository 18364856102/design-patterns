package com.qunar.design.structural.proxy.dynamic2;

import java.lang.reflect.Proxy;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/26
 * @description ：
 * 学习：https://blog.csdn.net/yaomingyang/article/details/80981004
 * https://blog.csdn.net/yaomingyang/article/details/81040390
 * https://www.cnblogs.com/gonjan-blog/p/6685611.html
 * @version: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        ManTikTok manTikTok = new XueTikTok();
        MyProxyInvocationHandler myProxyInvocationHandler = new MyProxyInvocationHandler(manTikTok);
        // Proxy.newProxyInstance方法，会传入类加载器，需要实现的接口列表，代理类处理程序
        // 首先会根据类加载器和接口列表获取到代理类的构造方法，然后调用构造方法生成代理类，在生成代理类时会传入MyProxyInvocationHandler的实例
        // 方法执行都会执行到处理程序的invoke方法，处理程序对象也持有对于真实代理的引用，其第一个参数proxy就是真实代理对象。
        ManTikTok proxyInstance = (ManTikTok) Proxy.newProxyInstance(manTikTok.getClass().getClassLoader(), manTikTok.getClass().getInterfaces(), myProxyInvocationHandler);
        proxyInstance.tiktok();
    }
}
