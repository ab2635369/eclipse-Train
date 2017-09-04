package com.java.train22.ex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex22_1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Mechael");
		Set<String> set2 = new HashSet<String>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		Set<String> set3 = new HashSet<String>(set1);
		Set<String> set4 = new HashSet<String>(set2);
		Set<String> copySet1 = new HashSet<String>(set1);
		Set<String> copySet2 = new HashSet<String>(set2);
		
		
		
		
		set1.addAll(set2);
		
		System.out.println("并集为：");
		print1(set1);
		System.out.println();
		set3.retainAll(set4);
		set1.removeAll(set3);
		System.out.println("差集为：");
		print2(set1);
		System.out.println();
		copySet1.retainAll(copySet2);
		System.out.println("交集为：");
		print2(copySet1);
		
		
		
	}
	
	public static void print1(Collection e) {
		for (Object element : e) {
			System.out.print(element+" ");
		}
	}
	public static void print2(Collection e) {
		Iterator<String> iterator = e.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toString()+" ");
		}
	}
	
	public static Set<String> copy(Set set1) {
		Set<String> set = new HashSet<String>();
		set.addAll(set1);
		return set;
	}

}
