package com.loto.grammar.c.variables;

/**
 * Author：蓝田_Loto
 * PageName：b_VariablesPosition.java
 * Function：变量的分类（成员变量 & 局部变量）
 */

public class b_VariablesPosition {
    String name;           // 实例成员变量：直接定义在类中，在方法的外面
    static String name1;   // 类成员变量：直接定义在类中，在方法的外面

    //（2）方法的形参，属于局部变量
    void test(String address) {

        //（1）方法内部的变量，属于局部变量
        int age;

        //（3）21-23行，代码块中的变量，属于局部变量
        while (true) {
            int num;
        }
    }

    //（3）27-29行，代码块中的变量，属于局部变量（在类中，但是属于代码块中）
    {
        int flag;
    }

}


/* 结论 */

/*
成员变量：直接定义在类中，在方法的外面
分类1：类成员变量（使用static修饰的字段）
分类2：实例成员变量（没有使用static修饰字段）

局部变量：
（1）方法内部的变量，属于局部变量
（2）方法的形参，属于局部变量
（3）代码块中的变量，属于局部变量
 */