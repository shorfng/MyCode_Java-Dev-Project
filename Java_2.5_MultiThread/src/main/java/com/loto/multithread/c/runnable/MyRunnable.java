package com.loto.multithread.c.runnable;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 18:46
 * PageName：MyRunnable.java
 * Function：创建线程的方法2（实现 Runnable 接口）
 */

public class MyRunnable implements Runnable {
    // 定义线程要执行的run方法逻辑
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("我的线程：i=" + i);
        }
    }
}
