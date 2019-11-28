package twoDArray;
import java.util.*;
public class PrintLikeAwave {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		wavePrint(input);
		
	}
	
public static void wavePrint(int input[][]){
		
		// Write your code here
	
	int row=input.length;
	int col=input[0].length;
int j=0;
int i;

while(j<col) {
	//print odd cols
	
	for(i=0;i<row;i++) {
		System.out.print(input[i][j]+" ");
	}
	j++;
	if(j<col) {
		for(i=row-1;i>=0;i--) {
			System.out.print(input[i][j]+" ");
		}
	}
	//
	j++;
}
	
	
	
}
	
}
