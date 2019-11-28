package Recursion;
import java.util.*;
public class CheckNumber {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
	
	public static boolean checkNumber(int input[], int x) {
		
		if(input.length<=1) {
			
			if(input[0]==x) {
				return true;
			}else {
				return false;
			}
		}
		
		if(input[0]==x) {
			return true;
		}
		int smallInput[]=new int[input.length-1];
		
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		
		boolean smallAns =checkNumber(smallInput, x);
		
		if(!smallAns) {
			return false;
		}else {
			return true;
		}
	}
}
