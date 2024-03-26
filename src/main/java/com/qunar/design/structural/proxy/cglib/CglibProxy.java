package com.qunar.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/27
 * @description ：使用cglib帮我们创建出代理对象
 * @version: 1.0
 */
public class CglibProxy {

    /**
     * 为任意对象创建代理
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T createProxy(T t) {
        // 1.创建一个增强器
        Enhancer enhancer = new Enhancer();
        // 2.设置要增强哪个类的功能，增强器将会为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());
        // 3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            /**
             *
             * @param obj "this", the enhanced object
             * @param method intercepted Method 为了能获取到原方法的一些原数据信息
             * @param args argument array; primitive types are wrapped
             * @param proxy used to invoke super (non-intercepted method); may be called
             * as many times as needed
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                // 编写拦截逻辑
                System.out.println("方法执行前");
                // 目标方法执行
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("方法执行后");
                return result;
            }
        });
        return (T) enhancer.create();
    }
}
