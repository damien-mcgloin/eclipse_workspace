package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueExercise3 {

	public static void main(String[] args) {
		
		List<String> family = new ArrayList<String>();
		
		family.add("Damien");
		family.add("Jenny");
		family.add("Colin");
		family.add("Mum");
		family.add("Dad");
		
		Queue<String> myQ = new PriorityQueue<>(family);
		
		while(!myQ.isEmpty()) {
			System.out.println("Dequeue ...");
			System.out.println(myQ.poll());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
