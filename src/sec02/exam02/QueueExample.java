package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> msg	=new LinkedList<Message>();
		
		msg.offer(new Message("K","김병성"));
		msg.offer(new Message("L","이경은"));
		msg.offer(new Message("D","강아지"));
		
		while(!msg.isEmpty()) {
			Message message =msg.poll();
			
			switch(message.command) {
			case "K" :
				System.out.println(message.to + "에게 카톡");
				break;
			case "L":
				System.out.println(message.to + "에게 카톡");
				break;
			case "D":
				System.out.println(message.to + "에게 카톡");
				break;
			}
		}
	}

}
