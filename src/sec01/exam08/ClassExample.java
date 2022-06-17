package sec01.exam08;

import sec01.exam06.Button;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		첫번쨰 방법
//		Class clazz= Outter.class;
//		두번째 방법
//		Class clazz = Class.forName("sec01.exam06.Button");
//		세번째 방법
		Button clazza =new Button();
		Class clazz = clazza.getClass();
//	System.out.println(obj.toString());
//		System.out.println(Car.class);
//		System.out.println(car.getClass());
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
