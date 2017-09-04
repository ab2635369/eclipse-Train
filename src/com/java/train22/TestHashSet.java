package com.java.train22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("Bei jing");
		set.add("New York");
		set.add("Shen zhen");
		
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
	}

}
