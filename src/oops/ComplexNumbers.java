package oops;

public class ComplexNumbers {
int realNo;
int ImaginaryNo;

	
	public ComplexNumbers(int realNo,int ImaginaryNo) {
		this.realNo=realNo;
		this.ImaginaryNo=ImaginaryNo;
		
	}


	public void plus(ComplexNumbers c2) {
		// TODO Auto-generated method stub
		realNo=realNo+c2.realNo;
		ImaginaryNo=ImaginaryNo+c2.ImaginaryNo;	
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println(realNo+" "+"+"+" "+"i"+ImaginaryNo);
	}


	public void multiply(ComplexNumbers c2) {
		// TODO Auto-generated method stub
		int realNotemp;
		
		realNotemp=realNo *c2.realNo +ImaginaryNo*c2.ImaginaryNo*(-1);
		
		ImaginaryNo=realNo*c2.ImaginaryNo+c2.realNo*ImaginaryNo;
		realNo=realNotemp;
	}
	
	
	
	
	
	
	
}
