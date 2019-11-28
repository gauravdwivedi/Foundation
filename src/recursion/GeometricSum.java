package Recursion;
import java.text.DecimalFormat;
import java.util.*;
public class GeometricSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
		
	}
	
		public static double findGeometricSum(int k){
		if(k==0) {
				return 1;
			}
			
		
			double a=findGeometricSum(k-1);
			
			double ans=power(k, 2);
			
			return ((1/ans)+a);
		}
		
		public static int power(int k,int base) {
			int result=1;
			
			while(k!=0) {
				result *=base;
				--k;
			}
			
			return k;
		}
}
