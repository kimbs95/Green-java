package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 =new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime =System.nanoTime();
		for (int i = 0; i < 10; i++) {
			list1.add(i,String.valueOf(i));
		}
//		System.out.println(list1);
		endTime=System.nanoTime();
		System.out.println("ArrayList걸린시간:"+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime =System.nanoTime();
		System.out.println("LinkedList걸린시간"+(endTime-startTime));
	}

}
