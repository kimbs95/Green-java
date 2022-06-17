package sec01.exam066;

import sec01.exam044.Audio;
import sec01.exam044.Television;
import sec01.exam044.RemoteControl;

public class Myclass {
//	필드
	RemoteControl rc = new Television();
//	생성자
	Myclass(){
		
	}
	Myclass(RemoteControl rc){
		this.rc = rc; 
		rc.turnOn();
		rc.setVolume(5);
	}
	
//	메소드 
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
