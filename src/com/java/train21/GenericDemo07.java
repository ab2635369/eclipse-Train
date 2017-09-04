package com.java.train21;

/**
 * 泛型数组
 * @author user
 *
 */
public class GenericDemo07 {

	public static void main(String[] args) {
		Integer arr[]= {6,6,6};
		tell(arr);
	}
	
	public static <T> void tell(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
