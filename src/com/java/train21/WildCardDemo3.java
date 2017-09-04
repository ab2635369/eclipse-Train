package com.java.train21;

public class WildCardDemo3 {

	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack<>();
		GenericStack<Object> stack2 = new GenericStack<>();
		stack1.push("GOOD");
		stack1.push("IS");
		stack1.push("JAVA");
		stack2.push(666);
		add(stack1,stack2);
		WildCardDemo2.print(stack2);
	}
	
	public static<T> void add(GenericStack<T> stack1,GenericStack<? super T> stack2) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}

}
