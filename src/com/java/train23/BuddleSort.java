package com.java.train23;

import java.util.Scanner;

public class BuddleSort {
	
	public static void buddleSort(int[] list) {
		boolean needNextPass = true;
		for(int i=1;i<list.length && needNextPass;i++) {
			 needNextPass = false;
			for(int j = 0;j<list.length-i;j++) {
				needNextPass=true;
				if(list[j]>list[j+1]) {
					int a=list[j+1];
					list[j+1]=list[j];
					list[j]=a;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			Scanner input = new Scanner(System.in);
			a[i] = input.nextInt();
		}
		
		buddleSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
