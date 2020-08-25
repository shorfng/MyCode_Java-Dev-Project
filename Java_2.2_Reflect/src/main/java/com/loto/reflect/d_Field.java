package com.loto.reflect;

import java.lang.reflect.Field;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 16:15
 * PageName：d_Field.java
 * Function：字段
 */

public class d_Field {
    public static void main(String[] args) throws Exception {
        System.out.println("========= 对public修饰的字段进行操作 ==========");
        field();

        System.out.println("========= 对private修饰的字段进行操作（私有字段/暴力反射） ==========");
        privateField();
    }

    // 对public修饰的字段进行操作
    private static void field() throws Exception {
        // 1、获得Class
        Class clazz = Bean.class;

        // 2、获得实例
        Object object = clazz.newInstance();

        // 3.1 获取字段  getField("字段名")
        Field descriptionField = clazz.getField("description");

        // 3.2 为对象的字段赋值
        descriptionField.set(object, "bean的描述");

        // 3.3 获取对象的字段值
        Object fieldReturnObject = descriptionField.get(object);
        System.out.println("description字段返回值：" + fieldReturnObject);
    }

    // 对private修饰的字段进行操作（私有字段/暴力反射）
    private static void privateField() throws Exception {
        // 1、获得Class
        Class clazz = Bean.class;

        // 2、获得实例
        Object object = clazz.newInstance();

        // 3.1 获取字段  getDeclaredField("字段名")
        Field classNameField = clazz.getDeclaredField("className");

        // 3.2 暴力访问
        classNameField.setAccessible(true);

        // 3.3 为对象的字段赋值
        classNameField.set(object, "bean的类名称");

        // 3.4 获取对象的字段值
        Object fieldReturnObject = classNameField.get(object);
        System.out.println("description字段返回值：" + fieldReturnObject);
    }
}
