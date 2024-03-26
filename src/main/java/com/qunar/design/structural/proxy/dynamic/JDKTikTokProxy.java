package com.qunar.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/25
 * @description ：
 * @version: 1.0
 */
public class JDKTikTokProxy<T> implements InvocationHandler {

    private final T target;

    /**
     * 有参构造器，接收被代理对象
     *
     * @param t
     */
    public JDKTikTokProxy(T t) {
        this.target = t;
    }

    /**
     * 为被代理对象创建代理对象
     * 获取被代理对象的代理对象
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getProxy(T t) {
        /**
         * ClassLoader loader, 当前被代理对象的类加载器
         * Class<?>[] interfaces, 当前被代理对象所实现的所有接口
         * InvocationHandler h), 当前被代理对象在执行目标方法时可以使用h来定义拦截增强方法
         */
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JDKTikTokProxy(t));
        return (T) o;
    }

    /**
     * 定义目标方法的拦截逻辑，代理对象执行每个方法时都会进入的逻辑
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("真正执行被代理方法");
        // 反射执行
        Object invoke = method.invoke(target, args);
        System.out.println("返回值" + invoke);
        return invoke;
    }
}
