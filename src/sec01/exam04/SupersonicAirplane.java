package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL =1;
	public static final int SUPUER =2;
	 
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPUER) {
			System.out.println("초음속 비행입니다");
		}else {
			super.fly();
		}
	}
}
