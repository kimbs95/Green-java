package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}

}
