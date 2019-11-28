package Recursion;
import java.util.*;
public class CountZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}
	public static int countZerosRec(int input){
	
		if(input==0)
			return 0;
		
		if(input%10==0) {
			return 1+countZerosRec(input/10);
			
		}else {
			return countZerosRec(input/10);
		}
    
    }
}
