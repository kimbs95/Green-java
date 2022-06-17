package sec01.exam01;

//	바깥 클라스
class A {
	A(){System.out.println("A 객체가 생성");}

//	인스턴스 멤버 클래스
	class B{
		B(){System.out.println("B 객체 생성");}
		int filed1;

		void method1() {System.out.println("ㅋㅋㅋ");}
//		static void method2() {
//			System.out.println("뭐야");
//		}
	}
//	정적 멤버 클래스
	
	static class C{
		C(){System.out.println("C 객체 생성");}
		int field1;
		static int field2;
		void method1() {
			System.out.println("뭐양");
			 
		}
		static void method2() {
			System.out.println("난 병성");
		}	
		
	}

	public void method() {
//		로컬 클래스 , 함수 클래스
		class D{
			D(){System.out.println("D 객체 생성");}
			int field1;
//			static int field2;
			void method1() {
				System.out.println("놀자");
				
			}
//			static void method2(){}
		}
		D d =new D();
		d.field1 =3;
		d.method1();
	}
	
		
	}


