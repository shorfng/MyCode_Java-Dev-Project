package com.loto.api.m.math;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 22:17
 * PageName：a_MemberMethod.java
 * Function：Math_成员方法
 */

public class a_MemberMethod {
    public static void main(String[] args) {
        // [int] abs(int a)
        // API：返回 int 值的绝对值
        // 功能：返回值类型可以是int、long、double、float，参数a的类型也要做相应变化
        int i = Math.abs(-9);
        System.out.println(i); // 9

        // [double] ceil(double a)
        // API：返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数
        // 功能：返回值类型只能是double，返回 >= 参数a 的最小整数
        double d1 = Math.ceil(-11.1);
        System.out.println(d1); // -11.0

        // [double] floor(double a)
        // API：返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数
        // 功能：返回值类型只能是double，返回 <= 参数a 的最大整数
        double d2 = Math.floor(1.1);
        System.out.println(d2); // 1.0

        // [double] pow(double a, double b)
        // API：返回第一个参数的第二个参数次幂的值
        // 功能：返回值类型只能是double，表示a的b次方
        double d3 = Math.pow(2, 3);
        System.out.println(d3); // 8.0

        // [double] sqrt(double a)
        // API：返回正确舍入的 double 值的正平方根
        // 功能：返回值类型只能是double，表示a的开平方
        double d4 = Math.sqrt(4);
        System.out.println(d4); // 2.0

        // [double] random()
        // API：返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
        // 功能：来源也是Random类
        for (int j = 0; j < 5; j++) {
            double d5 = Math.random();
            System.out.println(d5);
        }

        // [int] round(float a)
        // API：返回最接近参数的 int
        // 功能：获取参数的四舍五入值，取整数
        double d6 = Math.round(1.234);
        System.out.println(d6); // 1.0
    }
}
