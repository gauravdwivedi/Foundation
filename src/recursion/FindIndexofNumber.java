package Recursion;
import java.util.*;
public class FindIndexofNumber {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
	
	
	public static int firstIndex(int input[], int x) {
		int startindex=0;
		return firstindexBetter(input, startindex, x);
	}
	
	public static int firstindexBetter(int input[],int startindex,int x) {
		
		if(startindex>=input.length-1) {
			return -1;
		}

		if(input[startindex]==x) {
			return startindex;
		}
		
		int ans=firstindexBetter(input, startindex+1, x);
		
		if(ans==-1) {
			return -1;
		}else {
			return ans;
		}
		
		
		}
		
		
		
		
	}


