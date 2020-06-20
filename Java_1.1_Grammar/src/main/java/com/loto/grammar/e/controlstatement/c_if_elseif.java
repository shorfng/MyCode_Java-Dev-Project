package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：c_if_elseif.java
 * Function：if 语句的第3种格式 if( ){ } else if( ) { }
 */

/* 代码实现：x 和 y 的关系满足如下
   x>=3     y = 2x + 1
   -1<=x<3  y = 2x
   x<-1     y = 2x – 1
   根据给定的 x 的值，计算出 y 的值并输出
*/
public class c_if_elseif {
    public static void main(String[] args) {
        int x = -5;
        int y = 0;

        if (x >= 3) {
            y = 2 * x + 1;
        } else if (-1 <= x && x < 3) {
            y = 2 * x;
        } else if (x < -1) {
            y = 2 * x - 1;
        }
        System.out.println("y的值为：" + y);
    }
}
