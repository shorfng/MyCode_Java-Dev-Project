package com.loto.grammar.c.variables;

/**
 * Author：蓝田_Loto
 * PageName：a_VariablesClassify.java
 * Function：变量的分类
 */

public class a_VariablesClassify {
    public static void main(String[] args) {
        dataType();   // 根据数据类型进行分类（5类9种）
        scope();      // 根据作用域的范围进行分类
        position();   // 根据在类中定义位置的不同进行分类（见b_VariablesPosition的java文件）
    }

    // 根据数据类型进行分类（5类9种）
    private static void dataType() {
        System.out.println("====== 1、整型的变量 =======");
        // 字节型（byte）
        byte a = 1;
        System.out.println("byte :" + a);

        // 短整型（short int）
        short b = 2;
        System.out.println("short int ：" + b);

        // 整型（int）
        int c = 300000;
        System.out.println("int :" + c);

        // 长整型（long int）
        long d = 4000000;
        System.out.println("long int :" + d);

        System.out.println("====== 2、浮点型类型的变量 =======");
        // 单精度浮点型（float）
        float e = 5.67F;
        System.out.println("float ：" + e);

        // 双精度浮点型（double）
        double f = 8.999;
        System.out.println("double : " + f);

        System.out.println("====== 3、字符型类型的变量 =======");
        // 字符型（char）
        char g = 'h';
        System.out.println("char : " + g);

        System.out.println("====== 4、boolean类型的变量 =======");
        // 布尔类型（boolean）
        boolean h = true;
        System.out.println("boolean : " + h);

        boolean i = false;
        System.out.println("boolean : " + i);

        System.out.println("====== 5、字符串类型的变量 =======");
        // 字符串类型（String）
        String str = "java";
        System.out.println(str);
    }

    // 根据作用域的范围进行分类
    private static void scope() {
        // 全局变量/外部变量
        // 局部变量/内部变量
        // TODO
    }

    // 根据在类中定义位置的不同进行分类（见b_VariablesPosition的java文件）
    private static void position() {
        // 成员变量/字段（Field）
        // 局部变量
    }
}
