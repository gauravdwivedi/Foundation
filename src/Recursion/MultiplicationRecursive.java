package Recursion;
import java.util.*;
public class MultiplicationRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}
	public static int multiplyTwoIntegers(int m, int n){
		if(n==0) {
			return 0;
		}
		
	int a=multiplyTwoIntegers(m, n-1);
		return a+m;
	}
}
