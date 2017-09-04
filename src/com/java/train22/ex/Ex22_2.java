package com.java.train22.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ex22_2 {

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\text.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
/*		PrintStream ps = new PrintStream(file);
		ps.println("qeqi dfig goret,qeqwe grtt.");
		ps.println("qeqi dfig goret,qeqwe grtt.");*/
		
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String str = null;
		/*while((str = reader.readLine())!=null) {
			System.out.println(str);
		}*/
		
		str = reader.readLine();
		System.out.println(str);
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		String[] words = str.split("[ \n\t\r.,;?!()]");
		System.out.println(words.length);
		for (int i = 0; i < words.length; i++) {
			/*String key = words[i].toLowerCase();
			if(map.get(key)==null) {
				map.put(key, value);
			}*/
			map.put(i,words[i]);
		}
		TreeSet<String> treeSet = new TreeSet<>();
		for (int i = 0; i < words.length; i++) {
			treeSet.add(map.get(i));
		}
		System.out.println(map);
		System.out.println(treeSet);
		reader.close();
		
	}

}
