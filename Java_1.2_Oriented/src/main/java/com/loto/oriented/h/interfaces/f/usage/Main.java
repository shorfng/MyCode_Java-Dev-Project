package com.loto.oriented.h.interfaces.f.usage;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：接口的使用
 */

public class Main {
    public static void main(String[] args) {
        // 有名对象
        MyImplement m = new MyImplement();
        show(m);

        // 匿名对象
        show(new MyImplement());

        // 调用类class的方法Method，获取MyInterface接口的实现类对象
        Class c = new Class();
        MyInterface my = c.Method(); // 方法的执行结果是接口实现类对象new MyImplement()
        my.function();
    }

    // 定义方法，方法的参数是接口类型
    // 调用方法，必须传递接口的任意实现类对象
    // 接口的使用1：接口作为方法的参数
    public static void show(MyInterface m) {
        // 接口的引用变量m，调用方法
        m.function();
    }
}
