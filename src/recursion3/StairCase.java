package recursion3;
import java.util.Scanner;
public class StairCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(staircase(n));
		System.out.println(findStep(n));
	
	}
	
	public static int staircase(int n) {
		
		if(n==1||n==0)
			return 1;
		else if(n==2)
			return 2;
		else
			return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}
	public static int findStep(int n) 
	{ 
		if (n == 1 || n == 0) 
			return 1; 
		else if (n == 2) 
			return 2; 
	
		else
			return findStep(n - 3) + 
				findStep(n - 2) + 
				findStep(n - 1);	 
	}
	
}
