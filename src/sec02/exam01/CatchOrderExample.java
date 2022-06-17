package sec02.exam01;

public class CatchOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" +result);
			
			
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("실행 매개값 부족");
		}catch(Exception e ) {
			System.out.println("실행에 문제가 있다");
		}finally {
			System.out.println(" 실행해 다시 ");
		}
	}

}
