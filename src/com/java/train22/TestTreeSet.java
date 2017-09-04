package com.java.train22;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Doom");
		set.add("Strom");
		set.add("Earth");
		set.add("Mars");
		set.add("Jugg");

		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted tree set:"+treeSet);
	}
}
