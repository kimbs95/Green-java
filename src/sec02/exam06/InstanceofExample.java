package sec02.exam06;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method 1 = child로 변환성공");
		}else {
			System.out.println("method 1 = child로 변환실패");
		}
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 = child 로 변환성공");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
	}

}
