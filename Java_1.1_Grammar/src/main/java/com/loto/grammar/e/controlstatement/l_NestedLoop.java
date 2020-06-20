package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：l_NestedLoop.java
 * Function：嵌套循环（实心正方形、空心正方形、等腰三角形、直角三角形、九九乘法表）
 */

public class l_NestedLoop {
    public static void main(String[] args) {
        // 实心正方形
        System.out.println("实心正方形：");
        for (int i = 0; i < 5; i++) {      // 控制行数
            for (int j = 0; j < 9; j++) {  // 控制列数
                System.out.print("*");     // 控制每列打印内容
            }
            System.out.println();          // 每行打印结束，换行
        }

        System.out.println();

        // 空心正方形
        System.out.println("空心正方形：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 5 - 1 || j == 5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // 等腰三角形
        System.out.println("等腰三角形：");
        for (int i = 1; i <= 5; i++) {              // 控制行数
            for (int j = i; j <= 5; j++) {          // 控制空格的输出
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {   // 控制每列打印内容
                System.out.print("*");
            }
            System.out.println();                   // 每行打印结束，换行
        }

        System.out.println();

        // 直角三角形
        System.out.println("直角三角形：");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 九九乘法表
        System.out.println("九九乘法表：");
        for (int i = 1; i <= 9; i++) {     // 外循环，控制行数
            // 内循环，控制每行的数据
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }
            System.out.println("");
        }
    }
}