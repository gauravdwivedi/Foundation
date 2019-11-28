package StringsQuestions;

public class ReverseStringWordwise {
	public static String reverseWordWise(String input) {
		String ans="";
		int currentWordStart=0;
		int i = 0;
		for (; i < input.length(); i++) {
			
			if(input.charAt(i)==' ') {
				int currentWordEnd=i-1;
				String reverseWord="";
			
			for (int j = currentWordStart; j<=currentWordEnd; j++) {
				reverseWord+=input.charAt(j);
			}			
			ans=reverseWord+" "+ans;
			currentWordStart=i+1;
			
			}
		}
		int currentWordEnd=i-1;
		String reversedWord="";
		for (int j = currentWordStart;j<=currentWordEnd; j++) {
			reversedWord=reversedWord+input.charAt(j);
		}
		ans=reversedWord+" "+ans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to coding Ninjas";
		System.out.println(reverseWordWise(str));
	}
}
