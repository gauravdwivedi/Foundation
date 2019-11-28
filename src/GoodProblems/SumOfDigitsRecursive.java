package GoodProblems;
import java.util.*;
public class SumOfDigitsRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
	public static int sumOfDigits(int input){
		// Write your code here
		
		if(input==0) {
			return 0;
		}
		
		int sum=0;
		int remainder = input%10;
		sum+=remainder;
		input=input/10;
		
		int smallAns=sumOfDigits(input);
		
		return smallAns+sum;
	}
	
}
