package com.loto.grammar.f.array.one.array;

/**
 * Author：蓝田_Loto
 * PageName：b_Ergodic.java
 * Function：一维数组遍历（正向、反向、逆序）
 */

public class b_Ergodic {
    public static void main(String[] args) {
        // 数组定义初始化
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("正向遍历数组：");
        forwardErgodic(arr);
        System.out.println();
        System.out.println();

        System.out.println("反向遍历数组：");
        reverseErgodic(arr);
        System.out.println();
        System.out.println();

        System.out.println("方式1：逆序遍历数组");
        inverseErgodic1(arr);
        System.out.println();
        System.out.println();

        System.out.println("方式2：逆序遍历数组");
        inverseErgodic2(arr);
        System.out.println();
        System.out.println();
    }


    // 正向遍历 (依次输出数组中的每一个元素)
    private static void forwardErgodic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 反向遍历 (把数组反过来遍历)
    private static void reverseErgodic(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    // 方式1：逆序遍历（反向存入新数组brr，再遍历）
    private static void inverseErgodic1(int[] arr) {
        int[] brr = new int[arr.length];

        int j = 0;
        for (int k = arr.length - 1; k >= 0; k--) {
            brr[j] = arr[k];
            j++;
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    // 方式2：逆序遍历（交换索引值，再遍历）
    private static void inverseErgodic2(int[] arr) {
        int i = 0;               // 前面元素的索引值
        int j = arr.length - 1;  // 后面元素的索引值

        // 在 i < j的情况下，反复交换前后两个元素的值，直到i >= j，停止循环
        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            // 移动索引值
            i++;
            j--;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}