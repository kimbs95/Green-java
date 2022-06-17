package sec02.exam02;
import java.io.*;
public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception	{
		
//		쿨래스명.class.getResource("파일명.jpg").getPath();
		String originalFilePath1 = "E:/kimbs/pro01/src/sec02/exam02/mercedes1.jpg";
		String target1 = "C:/Temp/target1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(target1);
		
		
		
		String originalFilePath2 = "E:/kimbs/pro01/src/sec02/exam02/mercedes2.jpg";
		String target2 ="C:/Temp/target2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(target2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용하지 않았을때 :\t"+ nonBufferTime +"ns");
		
		long bufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용했을떄 :\t"+bufferTime+"ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is , OutputStream os ) throws Exception{
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}

}
