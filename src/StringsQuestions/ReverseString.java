package StringsQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="SAmple String";
String reverseString="";

for(int i=0;i<str.length()-1;i++) {
	
	reverseString=str.charAt(i)+reverseString;
}
		System.out.println(reverseString);
		
	}

}
