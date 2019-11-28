package twoDArray;
import java.util.Scanner;
public class SumArray {

	static int row;

	public static int[][] takeinput(){

	Scanner s =new Scanner(System.in);
	
	row=s.nextInt();
	int col=row;
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
		// TODO Auto-generated method stub
	int[][] arr=takeinput();
	int sum=0;
	int col=row;
	
		for (int i = 0; i < arr.length; i++) {
			for	(int j = 0; j < arr[i].length; j++) {
				if(i==j) {
					sum += arr[i][j];
				}
				if(i+j==arr.length-1) {
					sum += arr[i][j];
				}
				
//				if(i==j||i+j==row-1) {
//					sum+=arr[i][j];
//				}
			}
		}
		
		//adding corner elements 
		sum+=arr[0][0]+arr[0][col-1]+arr[row-1][0]+arr[row-1][col-1];
				
		System.out.println(sum);
	}
}
