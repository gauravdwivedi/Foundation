package test5;
import java.util.Scanner;
public class IncreasingNumber {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		printIncreasingNumber(a);
	}
	public static void printIncreasingNumber(int n) {
		/* Your class should be named Solution.
		 * Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        
        
         IncreasingNumber(0,0,n);
	}
    
    public static void IncreasingNumber(int a,int b,int n){
        if(n==0){
            System.out.print(a+" ");
            return;
        }

        
        for(int i=(b+1);i<10;i++){
            IncreasingNumber(a*10+i,i,n-1);
        }
    }
}
