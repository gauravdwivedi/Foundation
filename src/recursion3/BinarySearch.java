package recursion3;
import java.util.Scanner;
public class BinarySearch {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
	
	public static int binarySearch(int input[],int element) {
		
		return binarySearch(input,element,0,input.length-1);
		
	}
	
	 public static int binarySearch(int input[],int element,int start,int end){
	        
		 if (end>=start){  
	            int mid =  (end + start)/2;  
	            if (input[mid] == element){  
	            return mid;  
	            }  
	            if (input[mid] > element){  
	            return binarySearch(input,element, start, mid-1);//search in left subarray  
	            }else{  
	            return binarySearch(input,element,mid+1, end);//search in right subarray  
	            }  
	        }  
	        return -1;  
	    }
}
