package sec01.exam08;

import java.util.Hashtable;
import java.util.*;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String , String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
//			System.out.println("아이디와 비밀번호 입력해라 ");
			System.out.print("아이디:");
			String id =scanner.nextLine();
			System.out.print("비밀번호 입력해");
			String password =scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("오케이 확인 들어와");
					break;
				}else {
					System.out.println("너 비밀번호 모르지 ? ");
				}
			}else {
				System.out.println("너 해킹하려고 ?");
			}
		}
	}

}
