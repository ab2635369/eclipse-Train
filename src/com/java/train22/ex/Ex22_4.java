package com.java.train22.ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex22_4 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList( new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList( new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
		
		ArrayList<String> list1Clone1 = (ArrayList<String>) list1.clone();
		ArrayList<String> list1Clone2 = (ArrayList<String>) list1.clone();
		
		list1.addAll(list2);
		list1Clone1.removeAll(list2);
		list1Clone2.retainAll(list2);
		
		System.out.println("合集为："+list1);
		System.out.println("交集为："+list1Clone1);
		System.out.println("并集为："+list1Clone2);
		
	}

}
