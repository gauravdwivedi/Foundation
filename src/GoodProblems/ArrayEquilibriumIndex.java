package GoodProblems;
import java.util.Scanner;
public class ArrayEquilibriumIndex {

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
		System.out.print(arrayEquilibrium(arr));
	}
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
		//narrated by ANkush SInghal
		int totalSum=0;
		for (int i = 0; i < arr.length; i++) {
			totalSum+=arr[i];		
		}
		int index=0;
		int rightSum=0;
		int leftSum=0;
		while(index<arr.length) {
			rightSum=totalSum-leftSum-arr[index];
			if(rightSum==leftSum) {
				return index;
			}else {
				leftSum=leftSum+arr[index];
			}
			index++;
		}
		return -1;
	}

}
