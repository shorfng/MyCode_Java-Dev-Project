package com.loto.grammar.f.array.algorithm;

/**
 * Author：蓝田_Loto
 * PageName：Sort_Select.java
 * Function：选择排序算法（升序）
 */

public class Sort_Select {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 5, 2};

        // 选择排序
        for (int i = 0; i < arr.length; i++) {           // 外层循环，控制比较次数
            for (int j = i + 1; j < arr.length; j++) {   // 内层循环，控制参与比较的元素
                if (arr[i] > arr[j]) {                   // 如果前一个数组元素的值比后一个大
                    // 前后交换
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 排序后，遍历
        System.out.print("[");                       // 输出一半中括号，不要换行打印
        for (int i = 0; i < arr.length; i++) {
            // 判断遍历到的元素，是不是数组的最后一个元素
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");      // 输出数组的元素和]
            } else {                                 // 不是数组的最后一个元素，输出数组元素和逗号
                System.out.print(arr[i] + ",");
            }
        }

    }
}
