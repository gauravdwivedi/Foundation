package recursion3;
import java.util.Scanner;
public class PrintKeypad {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
	}
	
	public static String helper(int n) {
		String[] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wzyx"};
	
		return arr[n];
	}
	
	public static void printKeypad(int input){
		
		
		printKeypad(input,"");
	}
	
	public static void printKeypad(int input,String output) {
		if(input==0) {
			System.out.println(output);
			return;
		}
		
		int lastDigit=input%10;
		
		String options=helper(lastDigit); 
		
		for (int i = 0; i < options.length(); i++) {
			printKeypad(input/10,options.charAt(i)+output);
		}
		
		
	}

}
