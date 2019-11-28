package GoodProblems;
import java.util.*;
public class SumArray {
	public static int[][] takeinput(){

		Scanner s =new Scanner(System.in);
		int row;
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
			int[][] arr= takeinput();
			int sum=0;
			
			int i=0;
			int j=0;
			while(i==0 && j<arr.length) {
				sum+=arr[i][j];
				j++;
			}
			
			j=arr.length-1;
			i=1;
			while(j==arr.length-1 && i<arr.length-1) {
				sum+=arr[i][j];
				i++;
			}
			
			i=arr.length-1;
			j=arr.length-1;
			while(i==arr.length-1 && j==arr.length-1) {
				sum+=arr[i][j];
				i--;
				j--;
			}
			i =arr.length-1;
			j=arr.length-2;
			
			while(i==arr.length-1 && j>=0) {
				sum+=arr[i][j];
				j--;
			}
			i=arr.length-2;
			j=0;
			
			while(i>=1 && j==0) {
				sum+=arr[i][j];
				i--;
			}
			
			i=1;
			j=1;
			while(i<=arr.length-2 && j<=arr.length-2) {
				sum+=arr[i][j];
				i++;
				j++;
			}
			
			i=arr.length-2;
			j=1;
			while(i>=1 && j<=arr.length-2) {
				sum+=arr[i][j];
				i--;
				j++;
			}
			
			if(arr.length%2!=0) {
				i =(arr.length-1)/2;
				j=i;
				sum=sum-arr[i][j];
			}
		System.out.println(sum);
	}

}
