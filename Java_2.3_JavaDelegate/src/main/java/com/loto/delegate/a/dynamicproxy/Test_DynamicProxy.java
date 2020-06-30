package com.loto.delegate.a.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 17:31
 * PageName：Test_DynamicProxy.java
 * Function：Java代理 - JDK动态代理 (在运行时，在内存中动态的为目标对象创建一个虚拟的代理对象)
 */

public class Test_DynamicProxy {
    public static void main(String[] args) {
        // 1、创建目标类实例
        final UserService userService = new UserServiceImpl();

        // 2、动态创建代理对象
        // Object proxyObj = Proxy.newProxyInstance(参数1,参数2,参数3);
        // 参数1：ClassLoader，负责将动态创建类，加载到内存（当前类.class.getClassLoader();）
        // 参数2：Class[] interfaces ,代理类需要实现的所有接口（确定方法）（被代理类实例.getClass().getInterfaces();）
        // 参数3：InvocationHandler, 请求处理类，代理类不具有任何功能，代理类的每一个方法执行时，调用处理类invoke方法
        UserService proxyService = (UserService) Proxy.newProxyInstance(
                Test_DynamicProxy.class.getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {

                    // invoke：代表执行代理对象的方法
                    // proxy：代理对象
                    // method：代表目标对象的方法字节码对象
                    // args：代表目标对象的响应的方法的参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 获得方法名
                        String methodName = method.getName();

                        // 判断
                        if ("addUser".equals(methodName)) {
                            System.out.println("目标方法前的逻辑");
                            // 执行目标对象的方法（反射）
                            Object obj = method.invoke(userService, args);
                            System.out.println("目标方法后的逻辑");

                            // retrun返回的值给代理对象
                            return obj;
                        }
                        // 放行：执行目标类的方法
                        return method.invoke(userService, args);
                    }
                });

        // 3、执行代理类
        proxyService.addUser();
        System.out.println("==============");
        proxyService.updateUser();
    }
}