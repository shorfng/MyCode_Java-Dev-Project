package com.loto.oriented.a.method;

/**
 * Author：蓝田_Loto
 * PageName：d_Overload_Sum.java
 * Function：方法重载
 */

public class d_Overload_Sum {
    public static void main(String[] args) {
        int sum1 = sum(10, 20);
        System.out.println("两个整数的和：" + sum1);

        int sum2 = sum(10, 20, 30);
        System.out.println("三个整数的和：" + sum2);

        double sum3 = sum(1.1, 2.2);
        System.out.println("两个double的和：" + sum3);
    }

    // 求两个整数的和
    private static int sum(int a, int b) {
        return a + b;
    }

    // 求三个整数的和
    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 求两个double类型的数据的和
    private static double sum(double a, double b) {
        return a + b;
    }
}
