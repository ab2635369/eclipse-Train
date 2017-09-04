package com.java.train21;

public class WildCardDemo2 {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(2);
		intStack.push(1);
		intStack.push(-1);
		print(intStack);
	}
	
	public static void print(GenericStack<?> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" ");
		}
	}

}
