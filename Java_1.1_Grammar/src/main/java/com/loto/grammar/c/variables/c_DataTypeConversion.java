package com.loto.grammar.c.variables;

/**
 * Author：蓝田_Loto
 * PageName：c_DataTypeConversion.java
 * Function：变量的数据类型转换
 */

public class c_DataTypeConversion {
    public static void main(String[] args) {
        basicDataType();
        referenceDataType();
    }

    // 基础数据类型转换（byte -> short -> int -> long -> float -> double）
    private static void basicDataType() {
        // 隐式类型转换、自动类型转换
        byte a = 1;
        int b = 2;
        System.out.println(a + b + " " + "(byte -> int)");  // 3

        short c = 3;
        int d = 4;
        System.out.println(c + d + " " + "(short -> int)");  // 7

        char e = 'f';
        int g = 5;
        System.out.println(e + g + " " + "(char -> int)");  // 107 ( f 对应的ASCII为102)

        int h = 6;
        long i = 999994;
        System.out.println(h + i + " " + "(int -> long)");  // 1000000

        int j = 7;
        float k = 8.88f;
        System.out.println(j + k + " " + "(int -> float)");  // 15.88

        int l = 9;
        double m = 10.1;
        System.out.println(l + m + " " + "(int -> double)"); // 19.1

        long n = 111111;
        float o = 12.12f;
        System.out.println(n + o + " " + "(long -> float)"); // 111123.12

        long p = 131313;
        double q = 14.14;
        System.out.println(p + q + " " + "(long -> double)"); // 131327.14

        float r = 15.15f;
        double s = 16.16;
        System.out.println(r + s + " " + "(float -> double)"); // 31.309999618530274
    }

    // 引用数据类型转换
    private static void referenceDataType() {
    // TODO
    }
}
