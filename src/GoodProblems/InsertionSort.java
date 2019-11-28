 package GoodProblems;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
			insertionSort(arr);	
			print(arr);
		}
		
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		
		int n=arr.length;
		
		for(int i=1;i<n;i++) {
			
			int j=i-1;
			int temp=arr[i];
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
		
	}

}
