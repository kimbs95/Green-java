package sec01.exam05;

import java.io.FileInputStream;

public class ReadExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		java.io.InputStream is =new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int read = is.read(buffer);
			
			if(read == -1 ) break;
			
			for(int i=0; i< read; i++) {
				System.out.println(buffer[i]);
			}
				
			
		}
		is.close();
	}

}
