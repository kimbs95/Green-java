package sec01.exam04;

import java.awt.Toolkit;

public class BeepThread {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
