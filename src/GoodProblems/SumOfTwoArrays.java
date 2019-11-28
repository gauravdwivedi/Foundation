package GoodProblems;
import java.util.*;
public class SumOfTwoArrays {
	public static int[] sumOfTwoArrays(int[] num1, int[] num2){
		

	        int[] biggerArray = num1.length > num2.length ? num1 : num2;
	        int[] smallerArray = num1.length <= num2.length ? num1 : num2;

	        int[] summedArray = new int[biggerArray.length];
	        System.arraycopy(biggerArray, 0, summedArray, 0, biggerArray.length);

	        for (int i = 0; i < smallerArray.length; i++) {
	            summedArray[i] += smallerArray[i];
	        }

	       return summedArray;
		
	}
	

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
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
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(SumOfTwoArrays.sumOfTwoArrays(arr1, arr2));
	}
}
