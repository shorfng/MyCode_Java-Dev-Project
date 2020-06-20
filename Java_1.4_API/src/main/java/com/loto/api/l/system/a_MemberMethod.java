package com.loto.api.l.system;

/**
 * Author：蓝田_Loto
 * Date：2018-12-03 20:06
 * PageName：a_MemberMethod.java
 * Function：System_成员方法
 */

/*
* [long] currentTimeMillis()        获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
* [void] gc()                       用来运行JVM中的垃圾回收器，完成内存中垃圾的清除
* [String] getProperty(String key)  用来获取指定键(字符串名称)中所记录的系统属性信息具体信息
* [void] arraycopy(xxx)             复制数组
* [void] exit(int status)           用来结束正在运行的Java程序。参数传入一个数字即可。通常传入0记为正常状态，其他为异常状态
*/

public class a_MemberMethod {
    public static void main(String[] args) throws InterruptedException {
        function_1();
        System.out.println("======== Function_1 END ========");

        function_2();
        System.out.println("======== Function_2 END ========");

        function_3();
        System.out.println("======== Function_3 END ========");

        function_4();
        System.out.println("======== Function_4 END ========");

        function_5();
    }

    // [long] currentTimeMillis()  获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
    private static void function_1() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.sleep(2000);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    // [void] gc()   用来运行JVM中的垃圾回收器，完成内存中垃圾的清除
    private static void function_2() {
        new Person();
        new Person();
        new Person();
        new Person();

        System.gc();
    }

    // [String] getProperty(String key)  用来获取指定键(字符串名称)中所记录的系统属性信息具体信息
    private static void function_3() {
        System.out.println(System.getProperties());
    }

    // [void] arraycopy(xxx)   复制数组
    private static void function_4() {
        int[] src = {11, 22, 33, 44, 55, 66};  // 源数组
        int[] desc = {77, 88, 99, 0};          // 目标数组

        System.arraycopy(src, 1, desc, 1, 2);  // 复制数组

        // 遍历目标数组
        for (int i = 0; i < desc.length; i++) {
            System.out.println(desc[i]);
        }
    }

    // [void] exit(int status)  用来结束正在运行的Java程序。参数传入一个数字即可。通常传入0记为正常状态，其他为异常状态
    private static void function_5() {
        while (true) {
            System.out.println("hello");
            System.exit(0);
        }
    }
}