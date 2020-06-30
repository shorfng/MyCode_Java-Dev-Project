package com.loto.classloader;

/**
 * Author：蓝田_Loto
 * Date：2018-04-18 02:31
 * PageName：c_Initialization.java.java
 * Function：类的初始化
 */

class MyTest1 {
    // 静态代码块
    static {
        System.out.println("静态代码块：使用final的静态变量");
    }

    // 当静态变量用final修饰时，相当于“宏变量”，也可理解成“常量”，程序使用该静态变量也不会导致该类的初始化
    static final String compileConstant = "TD - final静态变量";

}

class MyTest2 {
    static {
        System.out.println("静态代码块：没有使用final的静态变量");
    }

    // 静态变量
    static String compileConstant = "TD - 静态变量";
}

class MyTest3 {
    static {
        System.out.println("静态代码块：使用final的静态变量，且其值无法确定");
    }

    // final修饰的静态变量，但是它的值没有办法确定，通过该类访问这个变量就会导致该类初始化
    static final String compileConstant = System.currentTimeMillis() + "";
}

public class c_Initialization {
    public static void main(String[] args) {
        System.out.println(MyTest1.compileConstant); // TD - final静态变量
        System.out.println("===============================");
        System.out.println(MyTest2.compileConstant); // 静态代码块：没有使用final的静态变量   TD - 静态变量
        System.out.println("===============================");
        System.out.println(MyTest3.compileConstant); // 静态代码块：使用final的静态变量，且其值无法确定  1523992800809
    }
}

