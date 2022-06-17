package pro01;

import java.io.IOException;
import java.util.Scanner;

public class CC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		
		
		while(true) {
			System.out.println("안녕 나는 로봇이야 무슨 얘기할까?");
			int keycode = System.in.read();
			System.out.println(keycode);
			int k = scanner.nextInt();
			if(k == 100) {
				break;
			}
		}
		System.out.println("로봇이 퇴장하였습니다");
	}

}
