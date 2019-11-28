package StringsQuestions;
import java.util.*;
public class RemoveConsecutiveDuplicates {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}

	private static String removeConsecutiveDuplicates(String input) {
	   String output=""+input.charAt(0);
		int i=1;
		int j=1;
		while(i<input.length()) {
			
			if(input.charAt(i-1)!=input.charAt(i)) {
				output=output+input.charAt(i);
			}
			
			
			i++;
		}
		
		return output;
	}
}
