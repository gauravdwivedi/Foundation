package Foundation;
import java.util.*;
public class ReturnArraySum {

	public static int sumOfArray(int arr[]) {
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=s.nextInt();
		}
		
		System.out.println(sumOfArray(arr));
		
		

	}

}
