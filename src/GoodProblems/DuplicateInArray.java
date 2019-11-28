package GoodProblems;
import java.util.Scanner;
public class DuplicateInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(duplicate(arr));
	}

	public static int duplicate(int[] arr){  
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		int n=arr.length;
		int sum2= ((n-2)*(n-1))/2;
		
		int result =sum-sum2;
		
		return result;
        
        
	}

}
