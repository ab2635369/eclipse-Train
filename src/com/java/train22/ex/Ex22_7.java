package com.java.train22.ex;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Ex22_7 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap<>();
		while (true) {
			String numberString = JOptionPane.showInputDialog(null, "Enter an integer:", "Ex22_7 Input",
					JOptionPane.QUESTION_MESSAGE);
			int number = Integer.parseInt(numberString);
			if(number==0)
				break;
			
			Integer key = new Integer(number);
			
			if(map.get(key)!=null) {
				int value = ((Integer) map.get(key)).intValue();
				value++;
				map.put(key, new Integer(value));
			}
			
			else {
				map.put(key, new Integer(1));
			}
		}
		
		Integer max = (Integer)(Collections.max(map.values()));
		Set keys = map.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			Object key = iterator.next();
			Integer value = (Integer)(map.get(key));
			if(value.equals(max)) {
				System.out.println("Number " + key + " occurred most");
			}
		}
		

	}
}
