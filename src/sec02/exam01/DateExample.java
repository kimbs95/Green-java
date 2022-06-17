package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now =new Date();
		String strNow1= now.toString();
	
		SimpleDateFormat  sdf =new SimpleDateFormat("yyyy년 MM월dd일hh시mm분ss초");
		System.out.println(sdf);
		String now1 = sdf.format(now);
		System.out.println(now1);
	}

}
