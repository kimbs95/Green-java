package sec01.exam06;

public class Button {
	OnClickListener listener;
	void setOnclickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
