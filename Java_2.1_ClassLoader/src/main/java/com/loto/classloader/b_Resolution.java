package com.loto.classloader;

/**
 * Author：蓝田_Loto
 * Date：2018-04-18 02:29
 * PageName：b_Resolution.java
 * Function：类的链接 - 解析
 */

public class b_Resolution {
    public static void main(String[] args) {
        symbolicReference();
        directReference();
    }

    // 符号引用
    private static void symbolicReference() {
        String s1 = "abc";
        System.out.println("s1 =" + s1);
    }

    // 直接引用
    private static void directReference() {
        System.out.println("s=" + "abc");
    }
}