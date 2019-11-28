package GoodProblems;
import java.util.*;
public class TripletSum {

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
		int[] input = takeInput();
		int x = s.nextInt();
		tripletSum(input, x);
	}

	public static void tripletSum(int[] input, int x){
		    // Fix the first element as A[i] 
	        for (int i = 0; i < input.length - 2; i++) { 
	  
	            // Fix the second element as A[j] 
	            for (int j = i + 1; j < input.length - 1; j++) { 
	  
	                // Now look for the third number 
	                for (int k = j + 1; k < input.length; k++) { 
	                	if ((input[i] + input[j] + input[k] )== x) 
	                     {
	                         if(input[i] <= input[j] && input[i] <= input[k]){
	                             System.out.print(input[i] + " ");
	                             if(input[j] <= input[k])
	                                 System.out.println(input[j] + " " + input[k]);
	                             else
	                                 System.out.println(input[k] + " " + input[j]);
	                         }
	                     else if(input[j] <= input[i] && input[j] <= input[k]){
	                             System.out.print(input[j] + " ");
	                             if(input[i] <= input[k])
	                                 System.out.println(input[i] + " " + input[k]);
	                             else
	                                 System.out.println(input[k] + " " + input[i]);
	                         } 
	                    else {
	                             System.out.print(input[k] + " ");
	                             if(input[i] <= input[j])
	                                 System.out.println(input[i] + " " + input[j]);
	                             else
	                                 System.out.println(input[j] + " " + input[i]);
	                         } 
	                } 
	            } 
	        } 
	  
	}
	}}
