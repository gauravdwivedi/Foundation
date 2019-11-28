package GoodProblems;

import java.util.Scanner;
import java.util.*;
public class Merger2SortedArrays {
	public static void main(String[] args) {

		int[] arr1 = {1,3,5,8,9};
		int[] arr2= {2,4,6,7};
		int[] arr3 = mergeArrays(arr1, arr2);
		print(arr3);
		
	}
		
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] mergeArrays(int arr1[],int arr2[]) {
		int m= arr1.length;
		int n=arr2.length;
		
		
		int arr[]=new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<m && j<n) {
			if(arr1[i] <= arr2[j]) {
				arr[k]=arr1[i];
				i++;
				k++;
			}else {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<m) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		
		return arr;
	}

}
