package com.java.train22.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
		String text = "Have a good day. Have a good class. " +
			      "Have a good visit. Have fun!";

			    // Create a hash map to hold words and key and count as value
			    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

			    StringTokenizer st = new StringTokenizer(text, " .!?");
			    while (st.hasMoreTokens()) {
			      String key = st.nextToken();

			      if (hashMap.get(key) != null) {
			        int value = ((Integer)hashMap.get(key)).intValue();
			        value++;
			        hashMap.put(key, new Integer(value));
			      }
			      else {
			        hashMap.put(key, new Integer(1));
			      }
			    }

			    // Create a tree map from the hash map
			    TreeMap<String, Integer> treeMap =
			      new TreeMap<String, Integer>(hashMap);

			    // Get an entry set for the tree map
			    Set entrySet = treeMap.entrySet();

			    // Get an iterator for the entry set
			    Iterator iterator = entrySet.iterator();

			    ArrayList<WordOccurrence1> list = new ArrayList<WordOccurrence1>();

			    while (iterator.hasNext()) {
			      StringTokenizer st1 =
			        new StringTokenizer(iterator.next().toString(), "=");
			      list.add(new WordOccurrence1(st1.nextToken(),
			        Integer.parseInt(st1.nextToken())));
			    }

			    Collections.sort(list);
			    for (int i = 0; i < list.size(); i++) {
			      System.out.println(list.get(i));
			    }
			  }
			}

			class WordOccurrence1 implements Comparable {
			  String word;
			  int count;

			  public WordOccurrence1(String word, int count) {
			    this.word = word;
			    this.count = count;
			  }

			  public int compareTo(Object o) {
			    return count - ((WordOccurrence1)o).count;
			  }

			  public boolean equals(Object o) {
			    return word.equals(((WordOccurrence1)o).word);
			  }

			  public String toString() {
			    return word + " " + count;
			  }
			}