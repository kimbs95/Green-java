package sec02.exam01;

public class Cars {
	Tire frontL = new HankookTire();
	Tire frontR = new HankookTire();
	Tire backL = new HankookTire();
	Tire backR = new HankookTire();
	
	void run() {
		frontL.roll();
		frontR.roll();
		backL.roll();
		backR.roll();
	}
}
