package timecomplexity;
import java.util.Arrays;
import java.util.Scanner;
public class PairSum {
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
		int[] arr = takeInput();
		int num = s.nextInt();
		pairSum(arr, num);
	}

	
	public static void pairSum(int[] arr, int num){
	        
           
    Arrays.sort(arr);
    int start=0;
    int end =arr.length-1;
    
    while(start<end ){
        if(arr[start]+arr[end]==num){
        	//to check if i+1 and j-1 is same number as previous
        		//this if condition is to check if all elements from start to end are same
        	//for example 2 2 2 2 2 2 2 2 2 2 2 
        	if(arr[start]==arr[end]){
         
         int count = end-start+1;
         int n=count-1;
         
         int totalcount=((n)*(n+1))/2;
                        
         while(totalcount>0){
             System.out.println(arr[start]+" "+arr[end]);
             totalcount--;
         }
         start=end;
     }      
            else{
                int countstart=0;
                int countend=0;
                int temp=arr[start],i=start;
                while(arr[i]==temp&&i<end){
                    i++;
                    countstart++;
                    
                }
                temp=arr[end];
                int j=end;
                while(arr[j]==temp&&j>start){
                    j--;
                    countend++;
                    
                }
                
                start=i;
                end=j;
                int totaltimes=countstart*countend;
                while(totaltimes>0){
                    System.out.println(arr[start-1]+" "+arr[end+1]);
                    totaltimes--;
                    
                }
            }
        }
        else if(arr[start]+arr[end]<num)
            start++;
        else
            end--;
    }
	    }
	}

	          	
	     

