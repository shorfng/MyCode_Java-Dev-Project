package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：g_OperatorPriority.java
 * Function：运算符优先级
 */

public class g_OperatorPriority {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;

        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);

        System.out.println("a=" + a + "b=" + b);
    }
}
