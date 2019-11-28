package Foundation;
import java.util.*;
public class LinearSearch {

	
	public static int linearSearch(int[] arr,int num) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int num=s.nextInt();
		
	System.out.println(linearSearch(arr, num));
	}

}
