package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
		int[] arr =new int[5];
		int num = 5;
		for(int i =0; i<arr.length;i++) {
			
				arr[i] = num;
				num--;
			
			System.out.println("arr["+i+"]="+arr[i]);
			
		}
	}

}
