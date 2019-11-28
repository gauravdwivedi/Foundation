package oops;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DynamicArray d =new DynamicArray();
		
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);
		d.add(9);
		d.add(10);
		
		d.set(20, 10);
		
		//d.print();
		d.print();
		d.printNonZero();
		
		
	}

}
