package com.loto.io.c.charstream.f.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 19:16
 * PageName：b_FileWriter_MemberMethod.java
 * Function：FileWriter_成员方法
 */

public class b_FileWriter_MemberMethod {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象
        FileWriter fw = new FileWriter("Java_1.6_IO/src/main/resources/FileWriter.txt");

        // 1、[void] write(String str):写一个字符串数据
        fw.write("abc");

        // 2、[void] write(String str,int index,int len):写一个字符串中的一部分数据, index:开始索引,len:写几个
        fw.write("123",0,1);

        // 3、[void] write(int ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
        fw.write('a');
        fw.write(97);

        // 4、[void] write(char[] chs):写一个字符数组数据
        char[] chs = {'a','b','c'};
        fw.write(chs);

        // 5、[void] write(char[] chs,int index,int len):写一个字符数组的一部分数据, index:开始索引,len:写几个
        fw.write(chs,0,1);

        // 释放资源
        fw.close();
    }
}
