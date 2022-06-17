package sec02.exam02;

public class Throw {
	public void method1() {
		try {
			method2();
		}catch(ClassNotFoundException e) {
			System.out.println("클ㄹ래스가 존재하지 않아");
		}
	}
	
	public void method2() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
//		public void method1() throws ClassNotFoundException{
//			method2();
//		}
	}
}
