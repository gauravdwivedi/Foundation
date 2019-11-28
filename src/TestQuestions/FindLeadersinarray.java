package TestQuestions;
import java.util.*;
public class FindLeadersinarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		
	for(int i=0;i<n;i++) {
		System.out.println(count_greater(input, n));
		
	}	
		
	}
	
	static int count_greater(int arr[], int n) 
	{ 
	    int min = Integer.MAX_VALUE; 
	    int counter = 0; 
	    
	   
	    for (int i = n - 1; i >= 0; i--) 
	    { 
	        if (arr[i] > min) 
	        { 
	            counter++;
	            
	        } 
	  
	        if (arr[i] <= min) 
	        { 
	            min = arr[i]; 
	        } 
	    } 
	    return counter; 
	} 

}
