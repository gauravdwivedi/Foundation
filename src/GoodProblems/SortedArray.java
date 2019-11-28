package GoodProblems;
import java.util.*;
public class SortedArray {


	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		sortBinaryArray(arr);
		print(arr);
	}

	public static void sortBinaryArray(int[] arr){
		
		
		int count =0;
		
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			
			if(arr[i]==1) {
				
			}
			
			
			
		}
		
	}
}
