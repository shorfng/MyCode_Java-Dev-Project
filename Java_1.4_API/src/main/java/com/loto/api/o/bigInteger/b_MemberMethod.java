package com.loto.api.o.bigInteger;

import java.math.BigInteger;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 22:40
 * PageName：b_MemberMethod.java
 * Function：BigInteger_成员方法（四则运算）
 */

public class b_MemberMethod {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1000000000000000");
        BigInteger b2 = new BigInteger("2000000000000000");

        // 加法
        BigInteger bigAdd = b1.add(b2);
        System.out.println(bigAdd);

        // 减法
        BigInteger bigSub = b2.subtract(b1);
        System.out.println(bigSub);

        // 乘法
        BigInteger bigMul = b1.multiply(b2);
        System.out.println(bigMul);

        // 除法
        BigInteger bigDiv = b2.divide(b1);
        System.out.println(bigDiv);
    }
}
