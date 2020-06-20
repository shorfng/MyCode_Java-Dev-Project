package com.loto.exception.b.customexception;

/**
 * Author：蓝田_Loto
 * PageName：CustomException.java
 * Function：自定义异常继承Exception
 */

public class CustomException extends Exception {
	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}
}
