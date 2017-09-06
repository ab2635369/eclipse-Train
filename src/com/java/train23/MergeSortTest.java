package com.java.train23;

import java.awt.List;
import java.util.Arrays;

public class MergeSortTest {
	
	public static void MergeSort(int[] list) {
		if(list.length>1) {
			int[] firstHalf = new int[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			MergeSort(firstHalf);
			
			int secondLength = list.length-list.length/2;
			int[] secondHalf = new int[secondLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondLength);
			MergeSort(secondHalf);
			
			int[] temp = merge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, list, 0, list.length);
		}
		
	}

	private static int[] merge(int[] firstHalf, int[] secondHalf) {
		int[] temp = new int[firstHalf.length+secondHalf.length];
		
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1<firstHalf.length&&current2<secondHalf.length) {
			if(firstHalf[current1]<secondHalf[current2]) {
				temp[current3++]=firstHalf[current1++];
			}
			else 
				temp[current3++]=secondHalf[current2++];
		}
		
		while(current1<firstHalf.length) {
			temp[current3++]=firstHalf[current1++];
		}
		
		while(current2<secondHalf.length) {
			temp[current3++]=secondHalf[current2++];
		}
		return temp;
	}

	public static void main(String[] args) {
		int[] list = {2,3,2,5,6,1,-2,3,14,12};
		MergeSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
