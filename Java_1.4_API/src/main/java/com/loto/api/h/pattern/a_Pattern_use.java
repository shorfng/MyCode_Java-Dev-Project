package com.loto.api.h.pattern;

/**
 * Author：蓝田_Loto
 * Date：2018-11-29 21:38
 * PageName：a_Pattern_use.java
 * Function：Pattern_正则表达式的使用
 */

/* 正则表达式在字符串中的用法
* boolean matches(String regex)                          判断字符串是否匹配给定的规则
* String[] split(String regex)                           根据给定正则表达式的匹配规则，拆分此字符串
* [String] repalceAll(String regex,String replacement)   将符合规则的字符串内容，全部替换为新字符串
*/


/* 正则表达式的规则
* 匹配正整数：\\d+
* 匹配正小数：\\d+\\.\\d+
* 匹配负整数：-\\d+
* 匹配负小数：-\\d+\\.\\d+
* 匹配保留两位小数的正数：\\d+\\.\\d{2}
* 匹配保留1-3位小数的正数：\\d+\\.\\d{1,3}
*/

public class a_Pattern_use {
    public static void main(String[] args) {
        // 1、boolean matches(String regex) 判断字符串是否匹配给定的规则
        // 校验qq号码：要求必须是5-10位数字，0不能开头
        String qq = "1234567890";
        boolean b1 = qq.matches("[1-9][0-9]{5,9}"); // 写法1
        boolean b2 = qq.matches("[1-9][\\d]{5,9}"); // 写法2
        System.out.println("b1 = " + b1);   // b1 = true
        System.out.println("b2 = " + b2);   // b2 = true

        // 校验手机号码：要求为11位数字，第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字
        String phoneNum = "13345678901";
        boolean b3 = phoneNum.matches("1[34578][0-9]{9}");
        System.out.println("b3 = " + b3);   // b3 = true

        // 匹配合法的邮箱规则： @前（数字字母和_,个数不少于1个），@后（数字字母，个数不少于1）
        String email = "shorfng@126.com";
        boolean b4 = email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b4);    // ture

        // 2、String[] split(String regex) 根据给定正则表达式的匹配规则，拆分此字符串
        // 按照12-34-56格式，对字符串进行切割
        String str = "12-34-56";
        String[] strArr = str.split("-");
        // 遍历切割后的数组
        for (String s1 : strArr) {
            System.out.println(s1);
        }

        //for (int i = 0; i < strArr.length; i++) {
        //    System.out.println(strArr[i]);
        //}

        // 3、[String] repalceAll(String regex,String replacement)   将符合规则的字符串内容，全部替换为新字符串
        String s = "Hello12345World6789012";
        String result = s.replaceAll("[0-9]", "*");
        System.out.println(result);    // Hello*****World*******
    }
}
