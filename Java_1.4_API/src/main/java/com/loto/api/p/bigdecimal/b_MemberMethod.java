package com.loto.api.p.bigdecimal;

import java.math.BigDecimal;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 22:45
 * PageName：b_MemberMethod.java
 * Function：BigDecimal_成员方法（四则运算）
 */

public class b_MemberMethod {
    public static void main(String[] args) {
        // 加法
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        // 减法
        BigDecimal b3 = new BigDecimal("1");
        BigDecimal b4 = new BigDecimal("0.32");
        BigDecimal bigSub = b3.subtract(b4);
        System.out.println(bigSub);

        // 乘法
        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        BigDecimal bigMul = b5.multiply(b6);
        System.out.println(bigMul);

        // 除法
        // 参数功能：BigDecimal divisor（被除数）  int scale（保留几位小数）  int roundingMode（保留模式）
        BigDecimal b7 = new BigDecimal("1.0301");
        BigDecimal b8 = new BigDecimal("100");
        BigDecimal bigDiv = b7.divide(b8, 2, BigDecimal.ROUND_HALF_UP);// 0.01301
        System.out.println(bigDiv);
    }
}
