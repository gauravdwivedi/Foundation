package timecomplexity;
import java.util.*;
public class FindTheTriplets {

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
		FindTriplet(arr, num);
	}
	
	public static void FindTriplet(int[] arr, int x){
		int end=arr.length-1;
		int start=0;
		int startfixed=0;
		int endfixed=end;
		while(end>start) {
			int i=1;
			while(i<endfixed) {
				if(arr[startfixed]+arr[endfixed]+arr[i]==x) {
					System.out.println(arr[startfixed]+" "+arr[i]+" "+arr[endfixed]);
				}
				i++;
			}
			start++;
			end--;
		}
        
	}
}
