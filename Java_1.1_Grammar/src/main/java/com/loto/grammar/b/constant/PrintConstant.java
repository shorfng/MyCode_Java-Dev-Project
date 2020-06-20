package com.loto.grammar.b.constant;

/**
 * Author：蓝田_Loto
 * PageName：PrintConstant.java
 * Function：打印6种字面值常量
 */

public class PrintConstant {
    public static void main(String[] args) {
        // 1、打印整数常量
        System.out.println("========  打印整数常量  ========");
        System.out.println(10);     // 十进制，正整数
        System.out.println(-10);    // 十进制，负整数
        System.out.println(0b1010); // 二进制，以0b/0B开头
        System.out.println(012);    // 八进制，数字开头0
        System.out.println(0xA);    // 十六进制，以0x/0X开头，由数字以0-9及A-F组成

        // 2、打印小数常量
        System.out.println("========  打印小数常量  ========");
        System.out.println(1.2);  // 正小数
        System.out.println(-1.2); // 负小数

        // 3、打印字符型常量
        System.out.println("========  打印字符型常量  ========");
        System.out.println('a');  // 小写字母
        System.out.println('A');  // 大写字母
        System.out.println('0');  // 数字
        System.out.println('字'); // 汉字

        // 4、打印布尔型常量
        System.out.println("========  打印布尔型常量  ========");
        System.out.println(true);  // 真
        System.out.println(false); // 假

        // 5、打印字符串常量
        System.out.println("========  打印字符串常量  ========");
        System.out.println("");    // 0个字符
        System.out.println("a");   // 1个字符
        System.out.println("abc"); // 多个字符

        // 6、空常量：null（不能被打印）
    }
}
