package Recursion;

public class CheckSorted2 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(checkSorted(input));
	}

	private static boolean checkSorted(int[] input) {
		// TODO Auto-generated method stub
		if(input.length<=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		

		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns=checkSorted(smallInput);
		return smallAns;
	}

}
