package Foundation;
import java.util.*;
public class ArrangeNumbersInArray {
public static int[] arrange(int n) {
	
	int arr[]=new int[n];
	
//	int p=0;
//	for(int i=0;i<=n;i+=2) {
//		
//		if(i>=n) {
//			break; 
//		}
//		arr[p]=i+1;
//		p++;
//		
//		
//	}
//	
//	for(int i=p+1;i>=2;i--) {
//		
//		if(arr[p]>n) {
//			
//			
//		}
//	}
//	for(int i=9;i>0;i-=2) {
//		arr[p]=i+1;
//		p++;
//	}
	
//	int mid=n/2;
//	
//	for(int i=0;i<=n;i++) {
//		if(i%2==0) {
//			
//			arr[mid]=i;
//		}else {
//			
//			arr[i]=i;
//		}
//	}
	int val=1;
    for(int s=0,e=n-1;s<=e;s++,e--){
        
    	if(s==e) {
    		arr[s]=n;
    		break;
    	}
    	
        arr[s]=val;
        val++;
        arr[e]=val;
        val++;
        
    }
		return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);

	int n=s.nextInt();

	int[] arr=new int[n];
	
		arr=arrange(n);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
