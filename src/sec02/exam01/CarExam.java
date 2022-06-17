package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars myCar =  new Cars();
		
		myCar.run();
		
		myCar.frontL = new KumhoTire();
		myCar.frontR = new KumhoTire();
		
		myCar.run();
		
	}

	

}
