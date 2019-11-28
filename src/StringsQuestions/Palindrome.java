package StringsQuestions;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(checkPalindrome(str));
		
	}
	
	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
        boolean isPalindrome =true;

        if(str==""){
            isPalindrome=false;
        }
        else{
            
        for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				isPalindrome=false;
				break;
			}
		}
    }
        return isPalindrome;
	}
}
