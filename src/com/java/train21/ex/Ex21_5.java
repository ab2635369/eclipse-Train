package com.java.train21.ex;

import java.util.ArrayList;

/**
 * 实现泛型方法找出数组中最大的元素
 * @author user
 *
 */

public class Ex21_5 {

	public static void main(String[] args) {
		String arr[] = {"Jiangxi","Guangdong","Hubei"};
		System.out.println(max(arr));
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E max=list[0];
		for (int i = 1; i < list.length; i++) {
			if(max.compareTo(list[i])<0) {
				max=list[i];
			}
		}
		return max;
	}

}
