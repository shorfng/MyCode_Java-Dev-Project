package com.loto.grammar.a.recognizejava;

/**
 * Author：蓝田_Loto
 * PageName：c_initValue.java
 * Function：创建一个类，包含一个int域和一个char域，它们都没有被初始化，将它们的值打印出来，以验证Java执行了默认初始化
 */

public class c_initValue {
    // 没有被初始化的int和char
    private int i;
    private char c;

    private c_initValue() {
        System.out.println("i = " + i);         // i = 0
        System.out.println("c = [" + c + ']');  // c = [ ]
    }

    public static void main(String[] args) {
        new c_initValue();
    }
}

/* 结论：Java执行了默认初始化 */