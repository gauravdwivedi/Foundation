package Recursion;
import java.util.*;
public class AllIndicesNumber {
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = AllIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
	
	
	public static int[] AllIndexesRecursive(int input[], 
            int x, int start) 
{ 
if (start == input.length) { 
int[] ans = new int[0];
return ans; 
} 


int[] smallIndex = AllIndexesRecursive(input, x, 
                          start + 1); 
 
if (input[start] == x) { 
int[] myAns = new int[smallIndex.length + 1]; 

myAns[0] = start; 
for (int i = 0; i < smallIndex.length; i++) { 

myAns[i + 1] = smallIndex[i]; 
} 
return myAns; 
} 
else { 

return smallIndex; 
} 
} 

public static int[] AllIndexes(int input[], int x) 
{ 

return AllIndexesRecursive(input, x, 0); 
} 

	
}
