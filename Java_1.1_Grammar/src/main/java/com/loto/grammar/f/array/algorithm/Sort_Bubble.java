package com.loto.grammar.f.array.algorithm;

/**
 * Author：蓝田_Loto
 * PageName：Sort_Bubble.java
 * Function：冒泡排序算法
 */

/* 思路
外层for循环，控制比较次数
内层for循环，控制参与比较的元素

元素比较规则（相邻元素比较）
步骤1：元素0跟元素1比较
步骤2：元素1跟元素2比较
步骤3：元素2跟元素3比较
步骤4：….

元素比较方法：如果元素 i 的值 > 元素 i+1 的值，互换，否则不互换
元素比较结果：先确定的是元素n，依次是元素n-1，n-2，n-3，n-4 .... 1，0
 */
public class Sort_Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 3, 5, 2};

        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {           // 外层循环，控制比较次数
            for (int j = 0; j < arr.length - i - 1; j++) {   // 内层循环，控制参与比较的元素
                if (arr[j] > arr[j + 1]) {                   // 如果前一个数组元素的值比后一个大
                    // 前后元素交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 排序后，遍历
        System.out.print("[");                    // 输出一半中括号，不要换行打印
        for (int i = 0; i < arr.length; i++) {
            // 判断遍历到的元素，是不是数组的最后一个元素
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");   // 输出数组的元素和]
            } else {                              // 不是数组的最后一个元素，输出数组元素和逗号
                System.out.print(arr[i] + ",");
            }
        }

    }
}
