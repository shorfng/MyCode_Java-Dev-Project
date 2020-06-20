package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：c_RelationalOperator.java
 * Function：关系运算符（比较运算符） （ ==  !=  >  <  >=  <= ）
 */

public class c_RelationalOperator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println( a == b );  // 等于，false
		System.out.println( a != b );  // 不等于，true
		System.out.println( a > b );   // 大于，false
		System.out.println( a < b );   // 小于，true
		System.out.println( a >= b );  // 大于等于，false
		System.out.println( a <= b );  // 小于等于，true
		
		boolean c = ( a == b ); 
		System.out.println( c );  // false
	}
}
