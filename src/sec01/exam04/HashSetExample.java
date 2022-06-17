package sec01.exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("jdbc");
		set.add("server");
		set.add("java");
		set.add("ibase");
		
		int size =set.size();
		System.out.println("객체수"+size);
		
		Iterator<String> iterator =set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("jdbc");
		set.remove("ibase");
		System.out.println("객체수"+set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t"+element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("비었다");}
	}

}
