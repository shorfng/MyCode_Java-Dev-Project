package com.loto.classloader;

/**
 * Author：蓝田_Loto
 * Date：2018-04-18 02:17
 * PageName：a_Loading.java
 * Function：类的加载
 */

public class a_Loading {
    // 类加载器的获取
    public static void main(String[] args) {
        // 获得字节码文件的类加载器
        Class clazz = a_Loading.class;                    // 获得字节码对象
        ClassLoader classLoader = clazz.getClassLoader(); // 获得类加载器

        // 获得classes下的任何的资源（即编译后的src文件夹）
        String path = classLoader.getResource("jdbc.properties").getPath();
        System.out.println(path);
    }
}
