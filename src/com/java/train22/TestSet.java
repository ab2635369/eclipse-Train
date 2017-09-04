package com.java.train22;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("Bei jing");
		set.add("New York");
		set.add("Shen zhen");
		
		TreeSet<String> set2 = new TreeSet(set);
		List<String> list = new ArrayList<>(set2);
		System.out.println(set);
		System.out.println(set2);
		
		String[] str = new String[2];
		str[0]="bbb";
		String s1 = "aaa";
		String s2 = "bbb";
		String s3 = "aaa";
		String s4 = "ccc";
		String s5 = "bbb";
		setoldOrgid(s1,str);
	}
	
	public static void setoldOrgid(String oldid,String[] a) {
		if(oldid!=a[0]){
			a[1]=oldid;
		}
	
	}
}


