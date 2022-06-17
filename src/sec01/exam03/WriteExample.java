package sec01.exam03;

import java.io.FileOutputStream;

public class WriteExample {

	public static void main(String[] args)	throws Exception {
		// TODO Auto-generated method stub
		java.io.OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {10,20,30,40,50,60,70,};
		
		
		os.write(array,1,3 );
		
//		어레이만 돌려보기 
		os.flush();
		
		os.close();
	}

}
