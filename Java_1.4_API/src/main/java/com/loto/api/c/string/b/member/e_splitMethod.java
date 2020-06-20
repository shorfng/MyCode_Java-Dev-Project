package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：e_splitMethod.java
 * Function：String常用成员方法 - 分割方法
 */

/* String[] split(String str)   把字符串使用str进行切割，切割之后得到的字符串组成一个字符串数组返回 */
public class e_splitMethod {
    public static void main(String[] args) {
        String s1 = "aa:bb:cc";
        String[] s2 = s1.split(":");

        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }
}
