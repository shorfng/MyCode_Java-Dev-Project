package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：a_if.java
 * Function：if 语句的第1种格式 if( ){ }
 */

public class a_if {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("使用if判断最大值是：" + b);
        }

        int max = a > b ? a : b;
        System.out.println("使用三元运算符得出最大值：" + max);
    }
}
