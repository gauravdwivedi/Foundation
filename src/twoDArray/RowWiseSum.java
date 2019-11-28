package twoDArray;
import java.util.*;

public class RowWiseSum {
	
public static void main(String[] args) {

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

for(int i=0;i<arr.length;i++) {
	sum=0;
	for (int j = 0; j < arr[0].length; j++) {
		sum+=arr[i][j];
	}
	System.out.print(sum+" ");
}

	

	
}
}
