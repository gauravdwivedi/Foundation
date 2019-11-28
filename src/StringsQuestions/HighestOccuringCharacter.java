package StringsQuestions;
import java.util.*;
public class HighestOccuringCharacter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(highestOccuringCharacter(input));
	}

	private static char highestOccuringCharacter(String input) {
	char ans;
	int count=0;
	int[] freq=new int[256];
	for(int i=0;i<input.length();i++) {
	
		int index=(int)input.charAt(i);
		freq[index]++;
		
	}
	ans=input.charAt(0);
	count=count=freq[(int)input.charAt(0)];

		for(int j=1;j<input.length();j++) {
			if(count<freq[input.charAt(j)]) {
			count=freq[(int)input.charAt(j)];
			ans=input.charAt(j);
			}
		}
	
		
		
		return ans;
	}
}
