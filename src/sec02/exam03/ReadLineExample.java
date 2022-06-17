package sec02.exam03;

import java.io.BufferedReader;
import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("E:/kimbs/pro01/src/sec02/exam03/lang.txt");
				
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
		}
		br.close();
	}

}
