package com.java.train22.ex;

import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex22_9 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println(
			        "Usage: java Ex22_9 fullfilename");
			      System.exit(0);
		}
		
		String filename = args[0];
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		try {
			Scanner input = new Scanner(new File(filename));
			
			
			String line;
			
			while((line=input.nextLine())!=null) {
				String[] words = line.split("[ \n\t\r.,;?'\")(]");
				
				for (int i = 0; i < words.length; i++) {
					if(words[i].trim().length()<1) continue;
					
					String key = words[i].toLowerCase();
					
					if(treeMap.get(key) != null) {
						int value = treeMap.get(key).intValue();
						value++;
						treeMap.put(key, value);
					}
					else {
						treeMap.put(key, 1);
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		
		System.out.println("\nDisplay words and their count in " +
			      " ascending order of the words");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue()+"\t"+ entry.getKey());
		}
	}

}
