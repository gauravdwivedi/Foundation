package oops;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Manisha");
		
		Student s2 =new Student("Ankush");

		Student s3 =new Student("Gaurav");

		System.out.println(s1.name+" "+s1);
		System.out.println(Student.getNumStudents());
		System.out.println(s3);
		
		
	}

}
