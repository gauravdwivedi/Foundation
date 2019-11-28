package StringsQuestions;
import java.util.*;
public class CompresstheString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}
	
	public static String compress(String inputString) {
		String output="";
			int count=0;
			int freq[]=new int[256];
		
			
			for(int i=0;i<inputString.length();i++) {
				int index=(int)inputString.charAt(i);
				freq[index]++;
				
			}
		return output;
		}
	}
