package sec01.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-456789";
		int a = ssn.indexOf("5");
		System.out.println(a);
		
		String firstNum = ssn.substring(4,8);
		System.out.println(firstNum);
		
		String zz = ssn.substring(4);
		System.out.println(zz);
	}

}
