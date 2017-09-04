package com.java.train21;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<E>();
	
	public int getSize() {
		return list.size();
	}
	
	public E peek() {
		return list.get(getSize() - 1);
	}
	
	public void push(E e) {
		list.add(e);
	}
	
	//返回并删除栈顶元素
	public E pop() {
		E o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

}
