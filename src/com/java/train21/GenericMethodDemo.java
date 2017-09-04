package com.java.train21;

public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		String[] strings = {"jiangxi","guangdong","fujian","hunan"};
		
		GenericMethodDemo.print(a);
		GenericMethodDemo.print(strings);
	}
	
	public static <E> void print(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]+" ");
			System.out.println();
		}
	}
	
	public class Max{
		public Comparable max(Comparable o1,Comparable o2) {
			if(o1.compareTo(o2)>0)
				return o1;
			else return o2;
	}
	}

}
