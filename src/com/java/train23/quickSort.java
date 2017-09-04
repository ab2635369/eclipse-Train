package com.java.train23;

public class quickSort {
	public static void quickSort(int[] list) {
		quickSort(list,0,list.length-1);
	}
	
	private static void quickSort(int[] list ,int first, int last) {
		if(last>first) {
			int pivotIndex = partition(list,first,last);
			quickSort(list,first,pivotIndex-1);
			quickSort(list,pivotIndex+1,last);
		}
	}

	//使用主元划分数组list[first..last] 
	private static int partition(int[] list, int first, int last) {
		//选择第一个元素作为pivot
		int pivot = list[first];
		int low = first+1;
		int high = last;
		
		while(high > low) {
			//从左边找到第一个比pivot大的数
			while(low<=high&&list[low]<=pivot) {
				low++;
			}
			//从右边找到第一个比pivot小的数
			while(low<=high&&list[high]>pivot) {
				high--;
			}
			//当还未交叉时交换这2个数的位置
			if(high>low) {
				int temp = list[high];
				list[high]=list[low];
				list[low] = temp;
			}
		}
		
		while(high>first&&list[high]>=pivot) {
			high--;
		}
		
		if(pivot>list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}

	public static void main(String[] args) {
		int[] list = {2,3,2,5,6,1,-2,3,14,12};
		quickSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

}
