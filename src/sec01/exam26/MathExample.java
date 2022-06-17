package sec01.exam26;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println();
		double v3= Math.ceil(5.3);
		double v4 =Math.ceil(-5.3);
		System.out.println(v3);
		System.out.println(v4);
		
		System.out.println();
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5);
		System.out.println(v6);
		
		System.out.println();
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(2.5, 5.6);
		System.out.println(v7);
		System.out.println(v8);
		
		System.out.println();
		int v9 = Math.min(2, 5);
		double v10 = Math.min(2.0, -1.0);
		System.out.println(v9);
		System.out.println(v10);
		
		
		double v11 = Math.random();
		System.out.println(v11);
		
		double v12 = Math.round(5.3);
		double v13 = Math.round(6.7);
		
		System.out.println(v12);
		System.out.println(v13);
		
		double value = 12.3456;
		double temp = value *100;
		long temp2 = Math.round(temp);
		double v14 =temp2/100.0;
		System.out.println(v14);
		
		
			
	}

}
