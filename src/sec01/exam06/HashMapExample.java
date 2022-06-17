package sec01.exam06;

import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String ,Integer> map = new HashMap<String, Integer>();
		
		map.put("이경은", 25);
		map.put("홍길동", 90);
		map.put("김병성", 80);
		map.put("홍길동", 95);
		System.out.println("총 ENTRY 수 :"+map.size());
		
		System.out.println("\t홍길동:"+map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key =keyIterator.next();
			Integer value= map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
	}

}
