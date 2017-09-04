package com.java.train22.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex22_5 {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\text2.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				PrintStream ps = new PrintStream(file);
				ps.println("ert,qweas,trtyr,yytr opiyr eww qe adasd,qqq,qqq,rwe,we,say,good,say,good");
				
			} catch (IOException e) {
				e.printStackTrace();
				}
			}
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(file));
			String str = null;
			List<String> list = new ArrayList<String>();
			str=reader.readLine();
			System.out.println(str);
			String[] words = str.split("[ \\n\\t\\r.,:?)({}\\[\\]]");
			for (int i = 0; i < words.length; i++) {
				list.add(words[i]);
			}
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				String string = (String) iterator.next();
				System.out.print(string+ " ");
			}
			System.out.println();
			Collections.sort(list);
			System.out.println(list);
	}

}
