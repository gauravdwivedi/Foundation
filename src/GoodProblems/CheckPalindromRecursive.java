package GoodProblems;
import java.util.*;
public class CheckPalindromRecursive {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
	
	public static boolean isStringPalindrome(String input) {
		// Write your code here
		
		
        return isStringPalindrome2(input,0,input.length()-1);
	}
	
	public static boolean isStringPalindrome2(String input,int start,int end) {
		if(start>=end) {
			return true;
		}
		
		boolean ans = true;
		if(input.charAt(start)!=input.charAt(end)) {
			 ans =false;
		}
		
	boolean flag = false;
		boolean smallAns =isStringPalindrome2(input,start+1,end-1);
		
		if(smallAns==true && ans==true) {
			flag=true;
		}
		
		return flag;
	}
}
