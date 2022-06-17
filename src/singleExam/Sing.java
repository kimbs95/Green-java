package singleExam;

public class Sing {
//	필드
	private static Sing car = new Sing();
	
//	생성자
	private  Sing() {} // 미리 Sing 을 생성해놓음 
	
//	메소드
	static  Sing getInstace() {
		return car; // 외부 호출을 불러오면 car 를 내부에서 car 를 호출
	}
	
}
