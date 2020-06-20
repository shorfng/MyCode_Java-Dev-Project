package com.loto.api.k.calendar;

import java.util.Calendar;

/**
 * Author：蓝田_Loto
 * Date：2018-11-30 0:16
 * PageName：Practice02_LeapYear.java
 * Function：求闰年（日历设置到指定年份的3.1日，add向前偏移1天，获取天数，如果是29，则是闰年）
 */

public class Practice02_LeapYear {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2000, 2, 1);       // 日历设置到指定年份的3.1日
        c.add(Calendar.DAY_OF_MONTH, -1); // add向前偏移1天

        // 获取当月中的天数
        int day = c.get(Calendar.DAY_OF_MONTH);
        int year = c.get(Calendar.YEAR);
        System.out.println(year + "年2月一共有：" + day + "天");

        // 判断是否是闰年
        if (day == 29) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}