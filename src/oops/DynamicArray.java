package oops;

public class DynamicArray {
private int nextElementIndex;
		private int data[];
		
		
		public DynamicArray() {
			data =new int[5];
			nextElementIndex=0;
}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex==0;
	}
	
	public int get(int i) {
		
		if(nextElementIndex<=i) {
			return -1;
		}
		return data[i];
	}
	public void add(int element) {
		if(nextElementIndex==data.length) {
			increaseCapacity();
		}
		
		
		data[nextElementIndex]=element;
		nextElementIndex++;
	}

	private void increaseCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		
		
		for (int i = 0; i < temp.length; i++) {
			data[i]=temp[i];
		}
	}
	
	public void set(int i,int element) {
		if(nextElementIndex<=i) {
			increaseCapacity();
		}
		if(i>=data.length) {
			increaseCapacity();
		}
		data[i]=element;
	}
	
	public int removeLast() {
		if(nextElementIndex
				==0) {
			return -1;
		}
		
		int temp=data[nextElementIndex-1];
		
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
	}
//	
//	public void add(int index,int element) {
//		if(nextElementIndex<=index) {
//			//throw error
//			return;
//		}
//		if(nextElementIndex==data.length) {
//			increaseCapacity();
//		}
//		int temp[] = new int[nextElementIndex];
//		for (int i = index-1; i < nextElementIndex; i++) {
//			temp[i]=data[i];
//		}
//		
//		data[index]=element;
//	}
	
	public void print() {
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		
	}
	
	public void printNonZero() {
		for (int i = 0; i < data.length; i++) {
			if(data[i]>0) {
				System.out.println(data[i]+" ");
			}
		}
	}
}
