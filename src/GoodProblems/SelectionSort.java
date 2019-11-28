package GoodProblems;
import java.util.*;
public class SelectionSort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		selectionSort(arr);
		print(arr);
	}
	public static void selectionSort(int[] arr){
		
		int len=arr.length;
		
		for(int i=0;i<len-1;i++) {
			
			
			
			//Inserting element at ith position
			
			int MIN=Integer.MAX_VALUE;
			int minIndex=-1;
			for (int j =i;j<len;j++) {
				
			//Finding the minimum element among j position	
				if(arr[j]<MIN) {
					MIN=arr[j];
					minIndex=j;
				}
			}
			//swap min element at min index with ith element
			int temp =arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	
	}
}
