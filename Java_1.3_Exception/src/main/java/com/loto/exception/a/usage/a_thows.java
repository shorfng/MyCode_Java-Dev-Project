package com.loto.exception.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：a_thows.java
 * Function：异常的声明和抛出
 */

public class a_thows {
    public static void main(String[] args) throws Exception {
        int[] arr = {};
        int i = getArray(arr);
        System.out.println(i);
    }

    // 对数组的最后索引*2,返回
    private static int getArray(int[] arr) throws Exception {
        // 对方法参数进行合法性的判断：判断是不是null
        if (arr == null) {
            // 抛出异常的形式,告诉调用者
            throw new Exception("传递数组不存在");
        }

        // 对数组进行判断：判断数组中，是不是有元素
        if (arr.length == 0) {
            // 抛出异常的形式,告诉调用者,数组没有元素
            throw new Exception("数组中没任何元素");
        }

        int i = arr[arr.length - 1];
        return i * 2;
    }
}
