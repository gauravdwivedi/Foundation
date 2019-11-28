package Foundation;
import java.util.*;

public class FindDuplicates {
	// Function to print duplicates 
   public static int  duplicate(int arr[]) 
    {
	   for(int i=0;i<arr.length;i++) {
		   int x=arr[i];
		   for(int j=i+1;j<arr.length;j++) {
			   if(x==arr[j]) {
				   return x;
			   }
		   }
	   }
	   
	   return 0;
    }  
    
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

}
