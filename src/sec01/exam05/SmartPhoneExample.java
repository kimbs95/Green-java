package sec01.exam05;

import java.sql.Date;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
//		Date obj2 =new Date();
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		
//		System.out.println(obj2.toString());
	}

}
