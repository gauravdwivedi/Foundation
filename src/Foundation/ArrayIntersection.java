package Foundation;
import java.util.*;
public class ArrayIntersection {
	
	public static void intersections(int[] input1, int[] input2){
		
		//O(m*n)
		for(int i=0;i<input1.length;i++) {
			int x=input1[i];
			for(int j=0;j<input2.length;j++) {
				if(x==input2[j]) {
					System.out.println(x);
					input2[j]=Integer.MIN_VALUE;
					break;
				}
			}
		}
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
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersections(arr1, arr2);
	}

}
