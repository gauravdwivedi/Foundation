package StringsQuestions;
import java.util.*;
public class AllSubString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		printSubstrings(str);
		
		
	}
	public static void printSubstrings(String str){
		    
//        for(int i=0;i<str.length();i++) {
//        	for(int j=0;j<=i;j++) {
//        		System.out.println(str.substring(j, i+1));
//        	}
//        }
		
		for(int start=0;start<str.length();start++) {
			for(int end=start;end<str.length();end++) {
				System.out.println(str.substring(start, end+1));
			}
		}
	}

}
