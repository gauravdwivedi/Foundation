package GoodProblems;

public class SecondLargestInArray {
	public static int print2largest(int arr[]) 
{ 
int i, first, second; 
int arr_size=arr.length;
if (arr_size < 2) 
{ 
return -2147483648; 
} 

first = second = Integer.MIN_VALUE; 
for (i = 0; i < arr_size ; i++) 
{ 

if (arr[i] > first) 
{ 
second = first; 
first = arr[i]; 
} 

else if (arr[i] > second && arr[i] != first) 
second = arr[i]; 
} 

if (second == Integer.MIN_VALUE)
	return -2147483648;
else
	return second; 
} 

/* Driver program to test above function */
public static void main(String[] args)  
{ 
int arr[] = {12, 35, 1, 10, 34, 1}; 
int n = arr.length; 
System.out.println(print2largest(arr)); 
} 
}
