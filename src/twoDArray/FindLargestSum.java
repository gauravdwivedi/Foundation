package twoDArray;
import java.util.*;
public class FindLargestSum {


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
		findLargest(input);
		largestRow(input);
		
	}
	
	public static void findLargest(int input[][]){
		

		int rows =input.length;
		int cols =input[0].length;
		int largest=Integer.MIN_VALUE;
		



	}
	
public static void largestRow(int[][] arr) {
		
		int rows =arr.length;
		int cols =arr[0].length;
		int largestCol=Integer.MIN_VALUE;
		int largestRow=Integer.MIN_VALUE;
		int largestcolIndex=0;
		int largestrowIndex=0;
		
		
		
		
		//find largest Col

		for (int i = 0; i < rows; i++) {
			int sum=0;
			for (int j = 0; j <cols; j++) {
				sum+=arr[i][j];
			}
			if(sum>largestCol) {
				largestCol=sum;
				largestcolIndex=i;
			}
		}

		
		//find largest row
		for (int j = 0; j < cols; j++) {
			int sum=0;
			for (int i = 0; i <rows; i++) {
				sum+=arr[i][j];
			}
			if(sum>largestRow) {
				largestRow=sum;
				largestrowIndex=j;
			}
		}
		
		if(largestRow>largestCol) {
			System.out.print("column"+" "+largestrowIndex+" "+largestRow);
		}else {
			System.out.print("row"+" "+largestcolIndex+" "+largestCol);
				
		}
		
	}


}
