package com.loto.exception.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：c_catch.java
 * Function：异常类名的顺序问题
 */

public class c_catch {
	public static void main(String[] args) {
		// 上下级关系的异常：抛出的异常类之间有继承关系，父类在后面catch
		// 如NullPointerException extends RuntimeException extends Exception
		try {
		} catch (NullPointerException ex) {

		} catch (Exception ex) {

		}
	}

	public static void function(int a) throws NullPointerException, Exception {
		if (a == 0) {
			throw new NullPointerException();
		}

		if (a == 1) {
			throw new Exception();
		}
	}
}
