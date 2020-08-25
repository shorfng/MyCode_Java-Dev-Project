package com.loto.reflect;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 13:35
 * PageName：a_Class.java
 * Function：Class获得方式
 */

public class a_Class {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式1：通过类型获得
        // 语法：类名.class
        // 应用场景：确定类型等
        Class clazz1 = Bean.class;
        System.out.println(clazz1);

        // 方式2：通过实例对象获得
        // 语法：变量.getClass()
        // 应用场景：在方法内部通过参数获得类型等
        Bean bean = new Bean();
        Class clazz2 = bean.getClass();
        System.out.println(clazz2);

        // 方式3：通过字符串获得
        // 语法：Class.forName("全限定类名")
        // 应用场景：通过配置获得字符串等
        Class clazz3 = Class.forName("com.loto.reflect.Bean");
        System.out.println(clazz3);
    }
}
