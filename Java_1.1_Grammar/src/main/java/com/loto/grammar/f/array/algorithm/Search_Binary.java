package com.loto.grammar.f.array.algorithm;

/**
 * Author：蓝田_Loto
 * PageName：Search_Binary.java
 * Function：折半查找
 */

public class Search_Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int searchNum = 4; // 指定被查找的元素

        System.out.println("======= 普通查找 =======");
        int index1 = search(arr, searchNum);
        System.out.println("索引为：" + index1);

        System.out.println("======= 二分查找 =======");
        int index2 = binarySearch(arr, searchNum);
        System.out.println("索引为：" + index2);
    }

    // 普通查找
    private static int search(int[] arr, int searchNum) {
        int flag = 1;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                index = i;
                flag = 0;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("没有该元素");
        }

        return index;
    }

    // 二分查找
    private static int binarySearch(int[] arr, int searchNum) {
        // 定义三个变量
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;

        // 进行循环折半 (可以折半的条件 min <= max)
        while (min <= max) {
            mid = (min + max) / 2; // 不断计算mid的值
            // 让被找元素，与min进行比较
            if (searchNum < arr[mid]) { // （1）被找元素 < mid, max = mid - 1
                // 表示 searchNum 在mid左侧
                max = mid - 1;
            } else if (searchNum > arr[mid]) { // （2）被找元素 > mid, min = mid + 1
                // 表示 searchNum 在mid右侧
                min = mid + 1;
            } else { // （3）被找元素 == mid, 找到该元素
                return mid;
            }
        }

        // 循环结束，元素没有找到，返回-1
        return -1;
    }
}
