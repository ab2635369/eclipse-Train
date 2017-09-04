package com.java.train23;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int[] list) {
		if(list.length>1) {
			int[] fristHalf = new int[list.length/2];
			System.arraycopy(list, 0, fristHalf, 0, list.length/2);
			mergeSort(fristHalf);
			
			int secondLength = list.length - list.length/2;
			int[] secondHalf = new int[secondLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondLength);
			mergeSort(secondHalf);
			
			int[] temp = merge(fristHalf, secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}

	
	private static int[] merge(int[] list1,int[] list2) {
		int[] temp = new int[list1.length+list2.length];
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1<list1.length&&current2<list2.length) {
			if(list1[current1]>list2[current2])
				temp[current3++]=list2[current2++];
			else
				temp[current3++]=list1[current1++];
		}
		
		while(current1<list1.length)
			temp[current3++]=list1[current1++];
		
		while(current2<list2.length)
			temp[current3++]=list2[current2++];
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		int[] list = {2,3,2,5,6,1,-2,3,14,12};
		mergeSort(list);
		//Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
