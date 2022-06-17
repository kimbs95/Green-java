package sec02.exam01;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.*;

public class CharacterConvertStreamExmple {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		write("문자 변환 스트림을 사용합니다");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer =new char[50];
//		int a = buffer.length;
		int readCharNum =reader.read(buffer);
		System.out.println(readCharNum);
		reader.close();
		
		String data = new String (buffer,0,readCharNum);
		return data;
	}

}
