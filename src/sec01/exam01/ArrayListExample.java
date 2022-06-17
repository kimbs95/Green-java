package sec01.exam01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList<String>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2,"database");
		list.add("ibatet");
		
		int size =list.size();
		
		System.out.println("총개수"+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:"+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i +":"+str);
			
		}
		System.out.println();
		
		list.remove(2);
		list.remove("java");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+":"+list.get(i));
			
		}
		System.out.println(list.size());
//		int[] arr = new int[5];
		
		
	}

}
