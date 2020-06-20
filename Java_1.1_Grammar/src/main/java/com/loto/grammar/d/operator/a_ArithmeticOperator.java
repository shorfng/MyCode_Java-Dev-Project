package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：a_ArithmeticOperator.java
 * Function：算术运算符（ +  -  *  /   %   ++  -- ）
 *                   （ 加  减 乘 除 取模 自增 自减 ）
 */

public class a_ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println("====== + 运算符=====");

        // + 的用法1：数字相加
        int a = 1;
        int b = 2;
        System.out.println(a + b);

        // + 的用法2：字符相加
        char c = 'a'; // 97
        char d = 'b'; // 98
        System.out.println(c + d);

        // + 的用法3：字符串相加
        int e = 3;
        int f = 4;
        System.out.println("字符串拼接：" + e + f);       // 字符串拼接：34
        System.out.println(e + f + " " + "先计算后拼接"); // 7 先计算后拼接

        // 减、乘、除、取余
        System.out.println("======减法、乘法、除法、取余运算符=====");
        System.out.println(a - b); // 减法 -1
        System.out.println(a * b); // 乘法 2
        System.out.println(a / b); // 除法 0
        System.out.println(a % b); // 取余、取模 1

        // 自增自减
        System.out.println("======自增自减运算符=====");
        System.out.println(a++); // 先赋值后自增 a=2 结果1
        System.out.println(a--); // 先赋值后自减 a=1 结果2
        System.out.println(++a); // 先自增后赋值 a=2 结果2
        System.out.println(--a); // 先自减后赋值 a=1 结果1
    }
}