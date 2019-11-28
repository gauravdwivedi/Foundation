package Recursion;
import java.util.Scanner;
public class AddStar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}
	
	
	public static String addStars(String s) {
		
		if(s.length()<=1) {
			return s;
		}
		
		
		String ans="";
	if(s.charAt(0)==s.charAt(1)) {
			 ans=s.charAt(0)+"*";
			}else {
				ans=""+s.charAt(0);
			}	
	
		
		String smallAns=ans+addStars(s.substring(1));
	
		return smallAns;
	}

}
