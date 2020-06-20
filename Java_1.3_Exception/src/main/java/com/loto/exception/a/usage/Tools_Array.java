package com.loto.exception.a.usage;

public class Tools_Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int i = getArray(arr);
		System.out.println(i);
		System.out.println("####");
	}
	
	private static int getArray(int[] arr){
		int i = arr[3];
		return i+1;
	}
}
