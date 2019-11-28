package recursion3;
import java.util.*;
public class KeypadCode {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	

    public static String[] helper(int n){
        if(n<=1||n>10){
            System.exit(0);
        }
        
        if(n==2){
            String output[]={"a","b","c"};
            return output;
        }
        else if(n==3){
            String output[]={"d","e","f"};
            return output;
        }
        
        else if(n==4){
            String output[]={"g","h","i"};
            return output;
        }
        else if(n==5){
            String output[]={"j","k","l"};
            return output;
        }
        else if(n==6){
            String output[]={"m","n","o"};
            return output;
        }
        else if(n==7){
            String output[]={"p","q","r","s"};
            return output;
        }
        else if(n==8){
            String output[]={"t","u","v"};
            return output;
        }
        else {
            String output[]={"w","x","y","z"};
            return output;
        }
    }

    
    
	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here

        if(n==0){
            String output[]={""};
            return output;
        }
        
        String smallAns[]=keypad(n/10);
        String ans[]=helper(n%10);
        String output[]=new String[ans.length*smallAns.length];
        int k=0;
        
        for(int a=0;a<ans.length;a++){
            for(int i=0;i<smallAns.length;i++){
                output[k]=smallAns[i]+ans[a];
                k++;
            }
        }
        return output;
	}
}
