package oops;

public class Student {

	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double CONVERSIONFACTOR =0.95;    //Constants
	private static int numStudents;
	
	public Student(String name) {
		this.name=name;
		numStudents++;
		this.rollNumber=numStudents++;
		
	}
	
	public static int getNumStudents() {
		return numStudents;
	}

	
	
}
