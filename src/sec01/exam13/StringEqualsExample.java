package sec01.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		
		if(strVar1 == strVar2) {
			System.out.println("같은");
		}else {
			System.out.println("다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
