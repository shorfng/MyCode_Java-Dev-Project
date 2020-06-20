package com.loto.api.i.date;

import java.util.Date;

/**
 * Author：蓝田_Loto
 * Date：2018-11-29 22:17
 * PageName：com.loto.dateformat.b_MemberMethod.java
 * Function：成员方法
 */

/*
* [void] setTime(long time)    将日期对象设置到指定毫秒值上，毫秒值转成日期对象
* [long] getTime()             将Date表示的日期转换成毫秒值，日期对象转换成毫秒值
* System.currentTimeMillis()   从时间原点(1970年)到当前日期的毫秒值
*/

public class b_MemberMethod {
    public static void main(String[] args) {
        Date date = new Date();

        // 1、[void] setTime(long time)：将日期对象设置到指定毫秒值上，毫秒值转成日期对象
        date.setTime(0);
        System.out.println(date); // Thu Jan 01 08:00:00 CST 1970


        // 2、[long] getTime() :将Date表示的日期转换成毫秒值，日期对象转换成毫秒值
        date.setTime(10000);
        long time = date.getTime();
        System.out.println(time); // 1000

        // 3、从时间原点(1970年)到当前日期的毫秒值
        long times = System.currentTimeMillis();
        System.out.println(times);
    }
}
