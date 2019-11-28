package twoDArray;
import java.util.*;
public class LargestColSum {

public static int[][] takeinput(){

	Scanner s =new Scanner(System.in);
	
	int row=s.nextInt();
	int col=s.nextInt();
	int arr[][]=new int[row][col];

	int sum=0;
	for(int i=0;i<row;i++) {
	for (int j = 0; j <col; j++) {
		arr[i][j]= s.nextInt();
	}
}
return arr;
}
	public static void main(String[] args) {
		int[][] arr=takeinput();
		System.out.println(largestCol(arr));
		
				
		
	}
	
	public static int largestCol(int[][] arr) {
		
		int rows =arr.length;
		int cols =arr[0].length;
		int largest=Integer.MIN_VALUE;
		int largestcolIndex=0;
		
		for (int j = 0; j < cols; j++) {
			int sum=0;
			for (int i = 0; i <rows; i++) {
				sum+=arr[i][j];
			}
			if(sum>largest) {
				largest=sum;
				largestcolIndex=j;
			}
		}
		return largest;
	}
	
	public static int largestRow(int[][] arr) {
		
		int rows =arr.length;
		int cols =arr[0].length;
		int largest=Integer.MIN_VALUE;
		

		for (int i = 0; i < rows; i++) {
			int sum=0;
			for (int j = 0; j <cols; i++) {
				sum+=arr[i][j];
			}
			if(sum>largest) {
				largest=sum;
			}
		}
		
		return largest;
	}

}
