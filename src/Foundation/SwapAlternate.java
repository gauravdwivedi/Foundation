package Foundation;
import java.util.*;
public class SwapAlternate {

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
		swapAlternate(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}

}

	private static void swapAlternate(int[] input) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<input.length;i=i+2) {
			
			int temp=input[i];
			if(i+2>input.length)
				break;
			input[i]=input[i+1];
			input[i+1]=temp;
			
		}
		
	}
		
	}
