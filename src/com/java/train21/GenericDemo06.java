package com.java.train21;

/**
 * 泛型方法
 * @author user
 *
 */
class Gener{
	public<T>T tell(T t){
		return t;
	}
}

public class GenericDemo06 {

	public static void main(String[] args) {
		Gener g = new Gener();
		System.out.println(g.tell("泛型"));
	}

}
