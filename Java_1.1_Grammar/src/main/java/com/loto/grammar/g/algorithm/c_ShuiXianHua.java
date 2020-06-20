package com.loto.grammar.g.algorithm;

/* 统计“水仙花数”共有多少个?
 
 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。 
 举例：153 就是一个水仙花数。 153 = 1*1*1 + 5*5*5 + 3*3*3
 思路分析：
 * 153 ----> 3    153 % 10 ---> 3     int g = i%10; 
 * 153 --->  5    153/10%10 ---> 5    int s = i/10%10;
 * 153 ---> 1     153/10/10%10---> 1  int b = i/10/10%10;
 */
public class c_ShuiXianHua {
    public static void main(String[] args) {
        forMethod();
        whileMethod();
        dowhileMethod();
    }

    // for
    private static void forMethod() {
        // 1.定义一个统计变量,初始值为0
        int count = 0;

        for (int i = 100; i < 1000; i++) {
            // 2.拆分三位数的百位,十位,个位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            // 3.利用公式判断这个三位数是否为水仙花数,如果是,统计变量++
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                count++;
            }
        }
        // 4.循环结束之后,打印统计结果
        System.out.println("水仙花数共有：" + count);
    }

    // while
    private static void whileMethod() {
        int count = 0;
        int i = 100;

        while (i < 1000) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
            i++;
        }
        System.out.println("水仙花个数：" + count);
    }

    // do while
    private static void dowhileMethod() {
        int count = 0;

        int i = 100;
        do {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
            i++;
        } while (i < 1000);
        System.out.println("水仙花数：" + count);
    }
}
