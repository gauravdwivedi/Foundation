package StringsQuestions;
import java.util.*;
public class CheckPermutation {

		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String input1 = s.next();
			String input2 = s.next();
			System.out.println(isPermutation(input1, input2));
		}
		
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
		boolean flag = true;
		
//		if(input1.length()==input2.length()) {
//			
//		for (int i = 0; i < input1.length(); i++) {
//			
//			char x = input1.charAt(i);
//			
//			for (int j = 0; j < input1.length(); j++) {
//			
//				if(input2.charAt(j)==x) {
//					flag=true;
//					break;
//				}else {
//					flag=false;
//					return flag;
//				}
//			}
//			
//			}	
//		}
		int[] freq=new int[256];
		
		if(input1.length()==input2.length()) {
			
			
			for (int i = 0; i<input2.length(); i++) {
				int index=(int)input1.charAt(i);
				freq[index]++;
				int index2=(int)input2.charAt(i);
				freq[index2]--;
		}
			
			for(int j=0;j<freq.length;j++) {
				if(freq[j]!=0) {
					flag=false;
					break;
				}
			}
		}
		
		
	return flag;
	}

}
