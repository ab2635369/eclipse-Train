package com.java.train21;

import java.util.ArrayList;

public class Genericstack2<E> {
	private E[] e = (E[]) new Object[10];

	public int getSize() {
		return e.length;
	}

	public E peek() {
		return e[e.length-1];
	}

	public void push(E e) {
	}

	// 返回并删除栈顶元素
	/*public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}*/
}
