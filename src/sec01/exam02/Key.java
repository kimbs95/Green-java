package sec01.exam02;

public class Key {
	public int number;

	public Key(int number) {
		this.number =number;
	}
	
//	오버라이딩
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
