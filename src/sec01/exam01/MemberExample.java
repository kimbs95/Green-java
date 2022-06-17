package sec01.exam01;


public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println(" obj 1과 obj2 는 동일");
		}else {
			System.out.println(" obj1 과 obj2 는 비동일");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3 은 동일 ");
		}else {
			System.out.println("obj1과 obj3 은 비동일");
		}
	}

}
