package com.loto.delegate.b.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 18:11
 * PageName：BookCglib.java
 * Function：使用Cglib动态代理的实现类
 */

public class BookCglib implements MethodInterceptor {
    private Object target;

    // 创建代理对象
    public Object getInstance(Object target) {
        this.target = target;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this); // 回调方法

        return enhancer.create();   // 创建代理对象
    }

    // 回调方法
    @Override
    public Object intercept(Object obj, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
        System.out.println("=== 开始 ===");
        methodProxy.invokeSuper(obj, arg);
        System.out.println("=== 结束 ===");

        return null;
    }
}
