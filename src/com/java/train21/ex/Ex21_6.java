package com.java.train21.ex;

/**
 * 实现泛型方法找出二维数组中最大的元素
 * @author user
 *
 */

public class Ex21_6 {

	public static void main(String[] args) {
		Integer list[][]= {{1,4,111},{98,32,555},{23,5765,111}};
		System.out.println(max(list));
	}
	
	public static<E extends Comparable<E>>E max(E[][] list){
		E max=list[0][0];
		for (int i = 0; i < list.length; i++) 
			for (int j = 0; j < list.length; j++) {
				if(max.compareTo(list[i][j])<0)
					max=list[i][j];
			}
		return max;	
	}

}
