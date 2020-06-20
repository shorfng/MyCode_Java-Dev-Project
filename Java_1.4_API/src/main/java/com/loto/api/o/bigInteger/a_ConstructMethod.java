package com.loto.api.o.bigInteger;

import java.math.BigInteger;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 22:39
 * PageName：a_ConstructMethod.java
 * Function：BigInteger_构造方法
 */

public class a_ConstructMethod {
    public static void main(String[] args) {
        // BigInteger(String val)
        // API：将 BigInteger 的十进制字符串表示形式转换为 BigInteger
        // 功能：传递字符串，要求数字格式，没有长度限制
        BigInteger b = new BigInteger("1000000000000000");
        System.out.println(b);
    }
}
