package com.loto.grammar.f.array.one.array;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：d_SearchValue.java
 * Function：一维数组查表法(根据键盘录入索引，查找对应值)
 */

public class d_SearchValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // 键盘输入索引
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数组索引：");
        int index = sc.nextInt();

        // 判断输入的索引值是否在有效范围
        if (index >= 0 && index <= arr.length) {
            System.out.print("根据索引，找到元素值为：" + arr[index]);
        } else {
            System.out.println("输入的索引不在数组范围内");
        }
        sc.close();
    }
}