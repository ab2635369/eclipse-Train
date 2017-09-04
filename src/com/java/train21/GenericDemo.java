package com.java.train21;
/**
 * 多个参数的泛型类
 * @author user
 *
 * @param <K>
 * @param <T>
 */
class Gen<K,T>{
	private K key;
	private T take;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public T getTake() {
		return take;
	}
	public void setTake(T take) {
		this.take = take;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		Gen<String,Integer> g = new Gen();
		g.setKey("泛型");
		g.setTake(666);
		System.out.println(g.getKey()+" "+g.getTake());
	}

}
