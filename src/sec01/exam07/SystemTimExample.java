package sec01.exam07;

public class SystemTimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		
		int sum =0 ;
		for(int i=1;i<=10000;i++) {
			sum +=i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("합"+sum);
		
		System.out.println((time2-time1)+"걸림");
				
				
				
	}

}
