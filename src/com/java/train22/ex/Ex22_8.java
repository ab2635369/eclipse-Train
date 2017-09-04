package com.java.train22.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Ex22_8 {

	public static void main(String[] args) {
		// Text in a string
	    String text = "Have a good day. Have a good class. " +
	      "Have a good visit. Have fun!";

	    // Create a hash map to hold words and key and count as value
	    TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
	    
	    StringTokenizer st = new StringTokenizer(text, " .!,?");
	    while(st.hasMoreTokens()) {
	    	String key = st.nextToken();
	    	
	    	if(treeMap.get(key)!=null) {
	    		int value = treeMap.get(key).intValue();
	    		value++;
	    		treeMap.put(key, new Integer(value));
	    	}
	    	else {
	    		treeMap.put(key, 1);
	    	}
	    }
	    
	    Set entrySet = treeMap.entrySet();
	    Iterator iterator = entrySet.iterator();
	    ArrayList<WordOccurrence> list = new ArrayList<WordOccurrence>();
	    
	    while(iterator.hasNext()) {
	    	StringTokenizer st1 = new StringTokenizer(iterator.next().toString(), "=");
	    	list.add(new WordOccurrence(st1.nextToken(),Integer.parseInt(st1.nextToken())));
	    }
	    
	    Collections.sort(list);
	    for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		}  

	}
	
	class WordOccurrence implements Comparable {

		String word;
		int count;
		
		public WordOccurrence(String word , int count) {
			this.word = word;
			this.count = count;
		}
		
		@Override
		public int compareTo(Object o) {
			return count - ((WordOccurrence)o).count;
		}
		
		public boolean equals(Object o) {
		    return word.equals(((WordOccurrence)o).word);
		  }

		  public String toString() {
		    return word + " " + count;
		  }
	}

