package com.qunar.design.structural.proxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ：qixue.xue
 * @date ：Created in 2024/3/26
 * @description ：
 * @version: 1.0
 */
public class MyProxyInvocationHandler implements InvocationHandler {

    private ManTikTok manTikTok;

    public MyProxyInvocationHandler(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前~");
        Object result = method.invoke(manTikTok, args);
        System.out.println("方法执行后~");
        return result;
    }
}
