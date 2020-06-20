package com.loto.api.n.wrapclass;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 22:26
 * PageName：b_MemberMethod.java
 * Function：包装类中的成员方法
 */

public class b_MemberMethod {
    public static void main(String[] args) {
        // [int] parseInt(String s) 把字符串转换成十进制数（字符串必须是数字格式）
        int a = Integer.parseInt("12");
        System.out.println(a);

        // [int] parseInt(String s, int radix) 把传递的进制数转换成十进制数（参数2为进制，参数1为参数2的具体数值，方法返回值是一个10进制数）
        int b = Integer.parseInt("11", 8);
        System.out.println(b);

        // 类型转换
        change1();
        change2();
    }

    // 类型转换1：int -> String
    private static void change1() {
        int c = 2;

        // 方法1：任何类型+“”，就变成String类型
        String s1 = c + "";
        System.out.println(s1 + 1);

        // 方法2：静态方法 toString()
        String s2 = Integer.toString(c);
        System.out.println(s2 + 1);
    }

    // 类型转换2：十进制转其他进制
    private static void change2() {
        System.out.println(Integer.toBinaryString(99)); // 转2进制
        System.out.println(Integer.toOctalString(99));  // 转8进制
        System.out.println(Integer.toHexString(99));    // 转16进制
    }
}
