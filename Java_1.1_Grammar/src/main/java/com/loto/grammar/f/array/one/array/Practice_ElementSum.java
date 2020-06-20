package com.loto.grammar.f.array.one.array;

/**
 * Author：蓝田_Loto
 * PageName：Practice_ElementSum.java
 * Function：求元素和
 */

public class Practice_ElementSum {
    public static void main(String[] args) {
        elementSum1();
        elementSum2();
    }

    /* 一维数组中满足要求的元素和
    (1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
    (2)求出该数组中满足要求的元素和
    (3)求和的元素的个位和十位不能包含7,并且只能为偶数
    */
    private static void elementSum1() {
        int[] arr = {171, 72, 19, 16, 118, 51, 210, 7, 18};
        int sum = 0; // 定义数组中满足条件的元素和

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 获得个位数和十位数
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;

            // 元素的个位和十位不能包含7,并且只能为偶数
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                sum += arr[i]; // 累加
            }
        }
        System.out.println("该数组中满足要求的元素和：" + sum); // 362
    }

    /* 按以下要求编写代码：
    （1）请定义一个数组，任意存储几个数字；
    （2）计算这个数组中所有元素的和，并打印这个和；
     */
    private static void elementSum2() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组所有元素的和是：" + sum); // 15
    }
}
