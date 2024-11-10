package Sorting_ApnaCollege;

import java.util.Arrays;
import java.util.Collections;

public class Bubble_Sort {
	public static void bubbleSort(int arr[]) {
		for(int turn=0;turn<arr.length;turn++) {
			for(int j=0;j<arr.length-1-turn;j++)
			{
				if(arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
			
		}
	}
	public static void printArr(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}
	
	public static void InsertionSort(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
			
			while(prev >=0 && arr[prev]>curr) {
				arr[prev+1]= arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		
	}
	
	public static void main(String[] args) {
		Integer arr[]= {5,3,4,1,2};
		// InsertionSort(arr);
		Arrays.sort(arr,0,3,Collections.reverseOrder());
		Arrays.sort(arr,Collections.reverseOrder());
		
	  printArr(arr);
	}

}
