package Foundation;
import java.util.*;
public class FindUnique {

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
		System.out.print(findUnique(arr));
	}

	static int findUnique(int a[])  
	{  
	    // Create a count array to store count of  
	    // numbers that have a particular bit set.  
	    // count[i] stores count of array elements  
	    // with i-th bit set.  
		int n=a.length;
		int k=2;
	    byte sizeof_int = 4; 
	    int INT_SIZE = 8 * sizeof_int;  
	    int count[] = new int[INT_SIZE];  
	  
	    // AND(bitwise) each element of the array  
	    // with each set digit (one at a time)  
	    // to get the count of set bits at each  
	    // position  
	    for (int i = 0; i < INT_SIZE; i++)  
	        for (int j = 0; j < n; j++)  
	            if ((a[j] & (1 << i)) != 0)  
	                count[i] += 1;  
	  
	    // Now consider all bits whose count is  
	    // not multiple of k to form the required  
	    // number.  
	    int res = 0;  
	    for (int i = 0; i < INT_SIZE; i++)  
	        res += (count[i] % k) * (1 << i);  
	    return res;  
	} 

}