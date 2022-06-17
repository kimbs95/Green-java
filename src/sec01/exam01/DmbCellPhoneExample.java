package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	DmbCellPhone  객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("병성폰","검정",10);
		
//		CellPhone으로 부터 상속받은 필드
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		
//		DmbCellPhone 의 필드
		System.out.println("채널 :"+dmbCellPhone.channel);
		
//		CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 ! 저는 병성이입니다");
		dmbCellPhone.sendVoice("아 ~ 만나서 반가워요.");
		dmbCellPhone.hangUp();
		
//		DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
	

}
