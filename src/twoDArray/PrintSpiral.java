//package twoDArray;
//import java.util.*;
//public class PrintSpiral {
//static Scanner s = new Scanner(System.in);
//	
//	public static int[][] takeInput2D(){
//		int numRows = s.nextInt();
//		int numCols = s.nextInt();
//		int[][] input = new int[numRows][numCols];
//		for(int i = 0; i < numRows; i++){
//			for(int j = 0; j < numCols; j++){
//				input[i][j] = s.nextInt();
//			}
//		}
//		return input;
//	}
//	
//	public static void main(String[] args) {
//		int a[][] = takeInput2D();
//		spiralPrint(a);
//	}
//	
//	
//	public static void spiralPrint(int matrix[][]){
//		// Write your code here
//		
//		int m=matrix.length;
//		int n=matrix[0].length;
//
//		 int i, k = 0, l = 0; 
//	        /*  k - starting row index 
//	        m - ending row index 
//	        l - starting column index 
//	        n - ending column index 
//	        i - iterator 
//	        */
//	  
//	        while (k < m && l < n) { 
//	            // Print the first row from the remaining rows 
//	            for (i = l; i < n; ++i) { 
//	                System.out.print(a[k][i] + " "); 
//	            } 
//	            k++; 
//	  
//	            // Print the last column from the remaining columns 
//	            for (i = k; i < m; ++i) { 
//	                System.out.print(a[i][n - 1] + " "); 
//	            } 
//	            n--; 
//	  
//	            // Print the last row from the remaining rows */ 
//	            if (k < m) { 
//	                for (i = n - 1; i >= l; --i) { 
//	                    System.out.print(a[m - 1][i] + " "); 
//	                } 
//	                m--; 
//	            } 
//	  
//	            // Print the first column from the remaining columns */ 
//	            if (l < n) { 
//	                for (i = m - 1; i >= k; --i) { 
//	                    System.out.print(a[i][l] + " "); 
//	                } 
//	                l++; 
//	            } 
//	        } 
//		
//		
//        
//	}
//}
