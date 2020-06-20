package com.loto.api.i.date;

import java.util.Date;

/**
 * Author：蓝田_Loto
 * Date：2018-11-29 22:03
 * PageName：a_ConstructMethod.java
 * Function：构造方法
 */

public class a_ConstructMethod {
    public static void main(String[] args) {
        // 1、Date( )  Date类空参数的构造方法
        Date date = new Date();
        System.out.println(date); // Wed Jul 12 15:34:53 CST 2017（CST表示标准时间）

        // 2、Date(long date)  Date类的long参数的构造方法
        Date d = new Date(0);   // 传毫秒值
        System.out.println(d);  // Thu Jan 01 08:00:00 CST 1970
    }
}
