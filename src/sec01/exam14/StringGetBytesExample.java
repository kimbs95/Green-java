package sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length:"+bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes=>string:"+str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2 : "+bytes2.length);
			String str2 =new String(bytes2,"EUC-KR");
			
			byte[] bytes3= str.getBytes("UTF-8");
			System.out.println("bytes3.length: "+ bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes3=> String:"+ str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
