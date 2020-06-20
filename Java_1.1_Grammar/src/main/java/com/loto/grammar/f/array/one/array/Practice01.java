package com.loto.grammar.f.array.one.array;

/*
按以下要求编写代码：
（1）定义二维数组存储以下值：
10 11 12 13 14
20 21 22 23 24
30 31 32 33 34
40 41 42 43 44
50 51 52 53 54
（2）按上面的格式打印这个二维数组；
（3）求所有数的累加和；
（4）求所有数的平均值；
 */
public class Practice01 {
    public static void main(String[] args) {
        int[][] arr = {{10, 11, 12, 13, 14}, {20, 21, 22, 23, 24}, {30, 31, 32, 33, 34}, {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}};

        // 打印这个二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 求所有数的累加和
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++; // 数组元素个数
            }
        }
        System.out.println("数组所有元素的累加和：" + sum);

        // 求所有数的平均值
        System.out.println("数组所有元素的平均值：" + (sum * 1.00 / count));
    }
}
