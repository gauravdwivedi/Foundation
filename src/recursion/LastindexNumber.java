package Recursion;
import java.util.*;
public class LastindexNumber {

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
		System.out.println(lastIndex(input, x));
	}
	

	public static int lastIndex(int input[], int x) {
			int EndIndex=input.length-1;
			
		return LastindexBetter(input,EndIndex,x);
	}
	
public static int LastindexBetter(int input[],int Endindex,int x) {
		
		if(Endindex>=input.length||Endindex<0) {
			return -1;
		}
		if(input[Endindex]==x) {
			return Endindex;
		}
		int ans=LastindexBetter(input, Endindex-1, x);
		
		if(ans==-1) {
			return -1;
		}else {
			return ans;
			}
		}

	}
