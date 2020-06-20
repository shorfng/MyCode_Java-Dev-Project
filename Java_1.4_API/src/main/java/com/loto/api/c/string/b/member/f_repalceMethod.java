package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：f_repalceMethod.java
 * Function：String常用成员方法 - 替换方法
 */

/* String replaceAll(String regex,String replacement)  使用 replacement 替换字符串中所有的regex */
public class f_repalceMethod {
    public static void main(String[] args) {
        String s1 = "aa:bb:cc";
        String s2 = s1.replace(":", ",");

        System.out.println(s2);  // aa,bb,cc
    }
}
