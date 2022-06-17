package sec01.exam044;

public class Audio  implements RemoteControl {
//	필드
	private int volume;
//	turnOn() 추상메소드의 실제 메소드
	public void turnOn() {
		System.out.println("Audio 를 켭니다");
	}
//	turnOff()추상메소드의 실제 메소드
	public void turnOff() {
		System.out.println("Audio 를 끕니다");
	}
//	setVolume()추상 메소드의 실제 메소드
	public void setVolume(int volume) {
		if(volume> RemoteControl.MAX_VOLUME) {
			this.volume= RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("현재 오디오"+this.volume);
	}
}
