package com.loto.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 14:26
 * PageName：c_Method.java
 * Function：Method方法 和 invoke执行
 */

public class c_Method {
    public static void main(String[] args) throws Exception {
        System.out.println("============== 操作setXXX方法 ================");
        setMethod();

        System.out.println("============== 操作getXXX方法 ================");
        getMethod();

        System.out.println("============== 操作私有方法（暴力反射） ================");
        privateMethod();

        System.out.println("============== 调用执行main方法 ================");
        mainMethod();
    }

    // 操作setXXX方法
    private static void setMethod() throws Exception {
        // 获得Class
        Class clazz = Bean.class;

        // 获得实例
        Object object = clazz.newInstance();
        //Object object = new Bean();

        // 获得方法 getMethod（方法名，形参的类型列表）
        Method setMethod = clazz.getMethod("setId", String.class);

        // 执行方法 invoke（实例，实参）
        Object setReturnObject = setMethod.invoke(object, "这里是参数");
        System.out.println("set方法返回值：" + setReturnObject);
    }

    // 操作getXXX方法
    private static void getMethod() throws Exception {
        // 获得Class
        Class clazz = Bean.class;

        // 获得实例
        Object object = clazz.newInstance();
        //Object object = new Bean();

        // 获得方法（没有形参）
        Method getMethod = clazz.getMethod("getId");

        // 执行方法（没有实参）
        Object getReturnObject = getMethod.invoke(object);
        System.out.println("get方法返回值：" + getReturnObject);
    }

    // 操作私有方法（暴力反射）
    private static void privateMethod() throws Exception {
        // 获得Class
        Class clazz = Bean.class;

        // 获得构造
        Constructor constructor = clazz.getConstructor(String.class, String.class);

        // 获得实例
        Object object = constructor.newInstance("ArrayListId", "java.util.ArrayList");
        //Object object = new Bean();

        // 获得方法 getDeclaredMethod（私有方法名）
        Method privateMethod = clazz.getDeclaredMethod("show");

        // 暴力访问
        privateMethod.setAccessible(true);

        // 执行方法（没有实参）
        Object getReturnObject = privateMethod.invoke(object);
        System.out.println("show方法返回值：" + getReturnObject);
    }

    // 调用执行main方法
    private static void mainMethod() throws Exception {
        // 获得Class
        Class clazz = Bean.class;

        // 获得方法
        Method mainMethod = clazz.getMethod("main", String[].class);

        // 执行方法
        Object getReturnObject = mainMethod.invoke(null, (Object) new String[]{"aa", "bb"});
        System.out.println("main方法返回值：" + getReturnObject);
    }
}
