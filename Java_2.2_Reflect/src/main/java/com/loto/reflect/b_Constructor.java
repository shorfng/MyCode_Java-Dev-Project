package com.loto.reflect;

import java.lang.reflect.Constructor;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 13:44
 * PageName：b_Constructor.java
 * Function：构造方法
 */

public class b_Constructor {
    public static void main(String[] args) throws Exception {
        System.out.println("无参构造");
        nonParameterConstructor();
        System.out.println("=================================");

        System.out.println("无参构造（简化版）");
        nonParameterConstructorSimple();
        System.out.println("=================================");

        System.out.println("有参构造");
        parameterConstructor();
        System.out.println("=================================");

        System.out.println("有参构造（私有构造/暴力反射）");
        privateConstructor();
    }

    // 无参构造，并获得实例
    private static void nonParameterConstructor() throws Exception {
        // 1、获得class
        Class beanClass = Bean.class;

        // 2、获得构造（没有形参）
        Constructor constructor = beanClass.getConstructor();

        // 3、获得实例对象（没有实参）
        Object bean = constructor.newInstance();
        System.out.println("bean：" + bean);
    }

    // 无参构造，并获得实例（简化版）
    private static void nonParameterConstructorSimple() throws Exception {
        // 1、获得class
        Class beanClass = Bean.class;

        // 2、获得实例对象（没有实参）
        Object bean = beanClass.newInstance();
        System.out.println("bean：" + bean);
    }

    // 有参构造，并获得实例
    private static void parameterConstructor() throws Exception {
        // 1、获得class
        Class benClass = Bean.class;

        // 2、获得构造（两个字符串类型的形参  Bean(String id, String className) ）
        Constructor constructor = benClass.getConstructor(String.class, String.class);

        // 3、获得实例对象（两个字符串类型的实参）
        Object bean = constructor.newInstance("ArrayListId", "java.util.ArrayList");
        System.out.println("bean：" + bean);
    }

    // 有参构造，并获得实例（私有构造/暴力反射）
    private static void privateConstructor() throws Exception {
        // 1、获得class
        Class benClass = Bean.class;

        // 2、获得构造（两个字符串类型的形参  Bean(String id)  ）
        Constructor constructor = benClass.getDeclaredConstructor(String.class);

        // 3、暴力访问
        constructor.setAccessible(true);

        // 4、获得实例对象（两个字符串类型的实参）
        Object bean = constructor.newInstance("userId");
        System.out.println("bean：" + bean);
    }
}
