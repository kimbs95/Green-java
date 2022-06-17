package sec01.exam16;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn ="777427389";
		int length = ssn.length();
		System.out.println(length);
		if(length == 9) {
			System.out.println(" 맞네 ? ");
		}else{
			System.out.println("틀렸네? ");
		}
	}

}
