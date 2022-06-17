package sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = System.in;
		Reader reader =new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력");
			String lineStr= br.readLine();
			if(lineStr.equals("그만") || lineStr.equals("quit")) break;
			System.out.print("내용 :"+ lineStr);
			System.out.println();
			
		}
		br.close();
	}

}
