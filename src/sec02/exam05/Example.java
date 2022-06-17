package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementC imp = new ImplementC();
		
		imp.methodA();
		imp.methodB();
		imp.methodC();
		System.out.println();
		
		InterfaceA  ia =imp;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp;
		ic.methodA();
		ib.methodB();
		ic.methodC();
	}

}
