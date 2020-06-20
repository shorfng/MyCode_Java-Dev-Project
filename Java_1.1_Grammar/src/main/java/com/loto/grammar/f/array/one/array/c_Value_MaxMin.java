package com.loto.grammar.f.array.one.array;

/**
 * Author：蓝田_Loto
 * PageName：.java
 * Function：一维数组获取最值(最大值、最小值)
 */

public class c_Value_MaxMin {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {12, 44, 45, 73, 60};

        System.out.print("数组中元素最大的是：");
        maxValue(arr);

        System.out.print("数组中元素最小的是：");
        minValue(arr);
    }

    // 获取最大值
    private static void maxValue(int[] arr) {
        // 定义一个参照物，假设第0个数组元素最大
        int max = arr[0];

        // 遍历数组，获取除了第0个元素以外的所有元素，进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // 如果第i个元素比max还大，则把第i个元素的值赋值给max
            }
        }
        System.out.println(max);
    }

    // 获取最小值
    private static void minValue(int[] arr) {
        // 定义一个参照物，假设第0个数组元素最小
        int min = arr[0];

        // 遍历数组，获取除了第0个元素以外的所有元素，进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // 如果第i个元素比min还小，则把第i个元素的值赋值给min
            }
        }
        System.out.println(min);
    }
}
